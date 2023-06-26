package quang.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
	ArrayList<String> PhoneList = new ArrayList<>();
	@Override
	void insertPhone(String name, String phone) {
		// TODO Auto-generated method stub
		boolean nameExists = false;
		for (String entry : PhoneList) {
			if(entry.split(":")[0].equals(name)) {
				nameExists = true;
				 if (!entry.split(":")[1].equals(phone)) {
	                    String updatedEntry = entry + "," + phone;
	                    PhoneList.remove(entry);
	                    PhoneList.add(updatedEntry);
	                }
				 break;
			}
		}
		  if (!nameExists) {
	            PhoneList.add(name + ":" + phone);
	        }
	}

	@Override
	void removePhone(String name) {
		// TODO Auto-generated method stub
		 for (String entry :PhoneList) {
	            if (entry.split(":")[0].equals(name)) {
	               PhoneList.remove(entry);
	                break;
	            }
	        }
	}

	@Override
	void updatePhone(String name, String newPhone) {
		// TODO Auto-generated method stub
		 for (String entry : PhoneList) {
	            if (entry.split(":")[0].equals(name)) {
	                String updatedEntry = name + ":" + newPhone;
	                PhoneList.remove(entry);
	                PhoneList.add(updatedEntry);
	                break;
	            }
	        }
	}

	@Override
	void searchPhone(String name) {
		// TODO Auto-generated method stub
		for (String entry : PhoneList) {
            if (entry.split(":")[0].equals(name)) {
                System.out.println("Số tìm được :" + entry.split(":")[0]+":" + entry.split(":")[1]);
            }
        }
	}

	@Override
	void sort() {
		// TODO Auto-generated method stub
		 Collections.sort(PhoneList, Comparator.comparing(entry -> entry.split(":")[0]));
	}

}
