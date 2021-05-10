package java_20210510;

public class MemberPay {
	private int seq;
	private int group;
	private String name;
	private int price;
	private boolean valid;
	private String status;
	private String sdate;
	private String edate;
	private String regdate;
	
	//seq의 setter=>seq를 수정할 때 사용  //반환값 없으면 void
	public void setSeq(int seq) {
		//this를 사용하는 이유는 로컬 변수와 멤버변수를 구분하기 위해 사용
		this.seq = seq;//왼쪽은 멤버변수고 오른족은 로컬변수
	}
	//seq의 getter => seq의 정보를 가져올 떄 사용
	public int getSeq() { //반환값있으니까 void필요없고 return으로 반환
		return seq;
	}
	//group의 setter
	public void setGroup(int group) {
		this.group = group;
	}
	
	//group의 getter
	public int getGroup() {
		return group;
	}
	
	public void setName(String name) {
		this.name=name;	
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
//valid의 getter 생성=>valid자료형이 boolean일 경우 getxxx가아니라 isxxx로 생성.
	public void setValid(boolean valid) {
		this.valid=valid;	
	}
	public boolean isvalid() {
		return valid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public boolean isValid() {
		return valid;
	}
	

	}