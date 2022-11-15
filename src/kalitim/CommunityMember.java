package kalitim;

public class CommunityMember 
{

	protected String Adi,Soyadi;
	protected String tel; // protected-> ayni paket icinde erisebiliyoruz
	public CommunityMember(String adi, String soyadi, String tel) 
	{
		super();
		Adi = adi;
		Soyadi = soyadi;
		this.tel = tel;
	}
	public void giris()
	{
		System.out.println(getAdi()+" giris yapti...");
	}
	public String getAdi() 
	{
		return Adi;
	}
	public void setAdi(String adi)
	{
		Adi = adi;
	}
	public String getSoyadi() {
		return Soyadi;
	}
	public void setSoyadi(String soyadi) 
	{
		Soyadi = soyadi;
	}
	public String getTel() 
	{
		return tel;
	}
	public void setTel(String tel) 
	{
		this.tel = tel;
	}
	/*public abstract String cikis()
	{
		return "Cikis yapti";
	}*/
}
