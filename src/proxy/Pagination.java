package proxy;

import java.util.Map;

import lombok.Data;
import service.MemberServiceImpl;

@Data
public class Pagination implements Proxy {
	private int pageNum, pageSize, blockSize, 
		count, pageCount, blockCount, 
		beginRow, endRow, beginPage, 
		endPage, prevBlock,	nextBlock,list;
	private boolean existPrev, existNext;

	@Override
	public void carryOut(Map<?,?> param) {
		pageNum = Integer.parseInt((String) param.get("pageNum"));
		pageSize = 5;
		blockSize = 5;
		count = MemberServiceImpl.getInstance().count(param);
		pageCount = (count % pageSize == 0)?count/pageSize:count/pageSize+1;
		blockCount = (pageCount%blockSize==0)?pageCount/blockSize:pageCount/blockSize+1;
		beginRow = 1 + pageSize*(pageNum-1);
		endRow = pageSize*(pageNum-1) + ((count - pageSize*(pageNum-1))>5?5:count - pageSize*(pageNum-1));
		beginPage = (pageNum%blockSize == 0)?1+blockSize*(int)(pageNum/(blockSize+1)):1+blockSize*(int)(pageNum/blockSize);
		endPage = ((beginPage + (blockSize-1))<pageCount?beginPage + (blockSize-1):pageCount);
		prevBlock = beginPage - blockSize;
		nextBlock = beginPage + blockSize;
		existPrev = (prevBlock >= 0);
		existNext = (nextBlock <= pageCount);
		System.out.println("=========== pagenation 내부 ========================");
		System.out.println("PageNum() : "+pageNum);
		System.out.println("Count() : "+count);
		System.out.println("pageCount() : "+pageCount);
		System.out.println("blockCount() : "+blockCount);
		System.out.println("beginRow() : "+beginRow);
		System.out.println("endRow() : "+ endRow);
		System.out.println("beginPage() : "+ beginPage);
		System.out.println("endPage() : " + endPage);
		System.out.println("existPrev() : " +  existPrev);
		System.out.println("existNext() : " +  existNext);
		System.out.println("prevBlock() : " +  prevBlock);
		System.out.println("nextBlock() : " +  nextBlock);
		System.out.println("=========== pagenation 완료 ========================");
	}
}
