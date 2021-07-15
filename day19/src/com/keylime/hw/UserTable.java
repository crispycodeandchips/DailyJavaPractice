package com.keylime.hw;

import java.util.HashMap;
import java.util.Iterator;

public class UserTable {  // MemberService
    private HashMap<String, StudentDTO> hm=new HashMap<String, StudentDTO>();
       

      // 학번 있는지 check 
	public boolean ischeck(String hak) {
		// TODO Auto-generated method stub
		 // hm.put("111",new StudentDTO("111","aa",20));
//		 Iterator<String> ita= hm.keySet().iterator();
//		  while(ita.hasNext())
//		  {
//			  String key=ita.next();
//			  if(hm.get(hak)!=null)
//				  return true;
//		  }
//		return false;
		
		return   hm.containsKey(hak);
	}


	
	//자료를 hm에 추가함
	public boolean insert(StudentDTO data) {
		// TODO Auto-generated method stub
		
		  StudentDTO value=hm.put(data.getHakno(), data);
		  if(value==null)
			 return  true;
	      else 
			  return false;	 
	}



	public HashMap<String, StudentDTO> list() {
		// TODO Auto-generated method stub
		return hm;
	}



	public StudentDTO search(String hakno) {
		// TODO Auto-generated method stub
		return hm.get(hakno);
	}



	public boolean delete(String hakno) {
		// TODO Auto-generated method stub
		
		  StudentDTO data=hm.remove(hakno);
		  if(data==null)
			  return false;
		  else
			   return true;
	}
    public boolean modify(String hakno, int age) 
    {
    	 StudentDTO dto=hm.get(hakno);
    	 if(age<0)
    		 return false;
      	 dto.setAge(age);
          return true;  	 
    }
}
