package kalitim;

public class Student extends CommunityMember
{
  protected String Studentid;

public Student(String adi, String soyadi, String tel, String studentid) 
{
	super(adi, soyadi, tel);
	Studentid = studentid;
}
public void giris()
{
	System.out.println(getAdi()+" giris yapti...");
}
public String getStudentid() 
{
	return Studentid;
}

public void setStudentid(String studentid) 
{
	Studentid = studentid;
}
public String cikis()
{
	  return "Ogrenci kapisindna cikis yapti";
}
}
