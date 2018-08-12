package enums;

public enum Domain {
	MEMBER, USER, EXAM, PROJECTTEAM, RECORD, SUBJECT;
	@Override
	public String toString() {
		String domain = "";
		switch(this) {
		case MEMBER:
			domain = "member";
			break;
		case USER:
			domain = "user";
			break;
		case EXAM:
			domain = "exam";
			break;
		case PROJECTTEAM:
			domain = "projectteam";
			break;
		case RECORD:
			domain = "record";
			break;
		case SUBJECT:
			domain = "subject";
			break;
		}
		return domain;
	}
}
