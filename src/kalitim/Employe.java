package kalitim;

public class Employe extends CommunityMember
{
  protected String departman;

public Employe(String adi, String soyadi, String tel, String departman) 
{
	super(adi, soyadi, tel);
	this.departman = departman;
}
public void giris()
{
	System.out.println(getAdi()+" giris yapti...");
}
public String getDepartman() 
{
	return departman;
}

public void setDepartman(String departman) 
{
	this.departman = departman;
}
  public String cikis()
  {
	  return "Kuzey kapisindna cikis yapti";
  }
}
