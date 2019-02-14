package day1129;



public class Work_sub extends Work {
	int j=0;
	private String temp2;
	private String temp3;
	public void createArr() {
		Work[] arr= null;
		arr=new Work[7];
		
		arr[0]=new Work(1, "이재찬", "서울시 강남구 역삼동", 28, "남자");
		arr[1]=new Work(2, "이재현", "서울시 동대문구 답십리동", 27, "남자");
		arr[2]=new Work(3, "김정운", "수원시 영통구 영통동", 26, "남자");
		arr[3]=new Work(4, "정택성", "서울시 구로구 구로동", 27, "남자");
		arr[4]=new Work(5, "정택순", "서울시 동작구 상도동", 29, "여자");
		arr[5]=new Work(6, "김건하", "경기도 부천시 부천동", 26, "남자");
		arr[6]=new Work(7, "이재순", "서울시 광진구 광나루동", 27, "여자");
		
		Work tempData=null;
		for(int i = 0; i<arr.length; i++) {
			tempData=arr[i];
			System.out.println(tempData.getNum()+", "+
						tempData.getName()+", "+tempData.getAddress()+", "+
						tempData.getAge()+", "+tempData.getGender());
			
		////////서울시에 살고있는 인원수 출력//////////
			if (tempData.getAddress().substring(0,3).equals("서울시")) {
				j++;
			}//end if
			addAge(tempData.getAge());
			maxAge(tempData.getAge());
			
			if(arr[i].getAge()==getMaxAge()) {
				temp2=arr[i].getName();
				temp3=arr[i].getGender();
			}//end if
		}//end for
		//////////////////////////////////////////////////////////
		System.out.println("서울시 거주자 "+j+"명");
		
		System.out.println("나이 합 "+getTotalAge()+"살");
		
		System.out.println("최고령자 "+temp2+"("+temp3+")");
		
	}//creatArr
	public static void main(String[] args) {
		Work_sub wo=new Work_sub();
		wo.createArr();
	
		
	}

}
