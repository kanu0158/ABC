package enums;

public enum Term {
	CONTEXT, WEBPATH, MAIN, MATCH, LIST, TEAM, ISID, NAME,COUNT,PAGENUM;
	
	@Override
	public String toString() {
		String term = "";
		switch (this) {
		case PAGENUM:
			term = "pageNum";
			break;
		case COUNT:
			term = "count";
			break;
		case ISID:
			term = "isid";
			break;
		case TEAM:
			term = "team";
			break;
		case LIST:
			term = "list";
			break;
		case MATCH:
			term = "match";
			break;
		case WEBPATH:
			term = "/WEB-INF/view";
			break;
		case MAIN:
			term = "/main.jsp";
			break;
		case CONTEXT:
			term = "context";
			break;
		case NAME:
			term = "name";
			break;
		}
		return term;
	}
}
