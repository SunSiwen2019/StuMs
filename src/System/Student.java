package System;

import java.math.BigInteger;

public class Student {

private int ID;
private String name;
private int classnum;
private BigInteger phonenum;

public void setID(int ID){
	this.ID=ID;
}
public void setname(String name){
	this.name=name;
}
public void setclassnum(int classnum){
	this.classnum=classnum;
}
public void setphonenum(BigInteger bigInteger){
	this.phonenum=bigInteger;
}

public int getID(){
	return ID;
}
public String getname(){
	return name;
}
public int getclassnum(){
	return classnum;
}
public BigInteger getphonenum(){
	return phonenum;
}
}
