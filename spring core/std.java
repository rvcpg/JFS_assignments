package com.sc;
import java.util.List;

@Component("ob")
@Scope("prototype")
public class std {
	 @Value("Ravi")
	 private String stdname;
	 @Value("Bihar")
	 private String city;
	 @Value("#{temp}")
	 private List<String> address;
	 public String getStudentName() {
		 return stdname;
	 }
	 public void setStudentName(String studentName ) {
		 this.stdname = stdname;
	 }
	 public String getCity() {
		 return city;
	 }
	 public void setCity(String city) {
		 this.city = city;
	 }

}
