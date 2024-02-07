package objectClass;
//은행계좌 클래스
public class Account {	//클래스 자체의 용도에 맞게 클래스 이름을 주는게 좋음. 첫글자는 대문자로
	//멤버변수(=필드, 속성). 첫글자는 소문자로
	static final String BANKNAME="신한은행";	//final:값을 한번만 받을 수 있음.(상수). 상수는 전체 대문자로
											//static : 정적멤버변수 -> 인스턴트 변수 만들 수 없음. 원본 객체로 접근. Account.뒤에만 가능
	String accountNo;	//계좌번호			//static이 없기 때문에 인스턴트 변수 만들 수 있음.
	String ownerName;	//예금주이름
	int balance;		//잔액
	


	//생성자(생성자는 이름 따로 줄 필요 없이 클래스 이름과 동일하게)*내가 생성자를 만들지 않으면 default로 빈 생성자를 만들어 줌.초기화 담당
	/*public Account(String accountNo, String ownerName, int balance) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;	//this를 붙이면 이름을 같게 하고도 만들 수 있음. this있는건 멤버변수, 없는건 매개변수)
	}*/

	public Account(String accountNo, String ownerName, int balance) {	//만드는 법 : [Source]-[Generate Constructor using field]
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public Account() {	//만드는법 : ctrl+space:Account
		
	}
	
	//예금한다 메서드
	void deposit(int amount) {	
	//void는 리턴값이 없고 어떤 일만 처리함. 메서드 이름은 개발자가 명명. 괄호 안에 있는건 매개변수(외부로부터 값을 받을 수 있는 변수)
		balance+=amount;	//balance=balance+amount;
	}
	//인출한다 메서드
	int withdraw(int amount) throws Exception {		//예외처리
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance-=amount;	//balance=balance-amount;
		return amount;
	}
	
}
