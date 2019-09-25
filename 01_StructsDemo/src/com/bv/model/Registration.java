package com.bv.model;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class Registration extends ActionSupport {
	private static final long serialVersionUID = -3725163528795853560L;
	private String username;
	private String password;
	private String gender;
	private String[] hobbies;
	private int age;
	private String doubleSelectRole;
	private String doubleSelectExpertise;
	private String[] skills;
	private String aboutYourself;
	private Date dob;
	private String mobileno;

	private File userImage;
	private String userImageContentType;
	private String userImageFileName;

	public File getUserImage() {
		return userImage;
	}

	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}

	public String getUserImageContentType() {
		return userImageContentType;
	}

	public void setUserImageContentType(String userImageContentType) {
		this.userImageContentType = userImageContentType;
	}

	public String getUserImageFileName() {
		return userImageFileName;
	}

	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}


	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	private String confirmPassword;
	private double percentage;

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String email;

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	@RequiredStringValidator(message = "Select gender")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDoubleSelectRole() {
		return doubleSelectRole;
	}

	public void setDoubleSelectRole(String doubleSelectRole) {
		this.doubleSelectRole = doubleSelectRole;
	}

	public String getDoubleSelectExpertise() {
		return doubleSelectExpertise;
	}

	public void setDoubleSelectExpertise(String doubleSelectExpertise) {
		this.doubleSelectExpertise = doubleSelectExpertise;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public String getAboutYourself() {
		return aboutYourself;
	}

	public void setAboutYourself(String aboutYourself) {
		this.aboutYourself = aboutYourself;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * @Override public void validate() {
	 * 
	 * if(username.equals("admin")&& password.equals("pass"))
	 * addActionMessage("Valid user"); else addActionError("Invalid credentials");
	 * 
	 * 
	 * if(username==null || username.equals("")) {
	 * addFieldError("username","The name is required"); }
	 * 
	 * if(age < 18 || age > 58) {
	 * addFieldError("age","Age must be between 18 and 58"); }
	 * 
	 * if(!(password.contains("@") || password.contains("#") ||
	 * password.contains("&") || password.contains("%"))) {
	 * addFieldError("password", "Please use alphanumeric character"); } else
	 * if(password.length() < 6 && password.length() > 10) {
	 * addFieldError("password", "Length should be between 6 and 10"); }
	 * 
	 * 
	 * if (LoginService.validateUser(username, password)) {
	 * addActionMessage("Valid User"); } else addActionError("Invalid User"); }
	 */

	@Override
	public String execute() throws Exception {
		System.out.println("inside execute----process------");
		/*
		 * try { File destFile=new File(destPath,fileName);
		 * 
		 * destPath="C:\\apache-tomcat-9.0.21\\work"; FileUtils.copyFile(myFile,
		 * destFile); } catch(Exception e) { e.printStackTrace(); return ERROR; }
		 */
		try {
			String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("userimages");

			System.out.println("Image Location:" + filePath);// see the server console for actual location
			File fileToCreate = new File(filePath, userImageFileName);
			FileUtils.copyFile(userImage, fileToCreate);// copying source file to new file
		} catch (Exception e) {
			System.out.println(e);
		}
		return SUCCESS;
	}
}
