package th.ac.kmitl.it.soa.group7.models;

public class IncludedNote {
	private String subject;
	private String content;
	
	public IncludedNote() {
	}
	
	public IncludedNote(String remark) {
		this.content = remark;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
}
