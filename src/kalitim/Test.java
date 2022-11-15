package kalitim;

public class Test 
{

	public static void main(String[] args) 
	{
		/*CommunityMember c = new CommunityMember("Mustafa","Erdogan","05374369361");
		System.out.println(c.getAdi()+" "+c.getSoyadi()+" "+c.getTel());
		c.giris();*/
		//AkademikPersonel a = new AkademikPersonel("Kerem","Sonmemis","123456789","Prof");
		//System.out.println(a.getUnvan()+" "+a.getAdi()+" "+a.getSoyadi()+" "+a.getTel());
		//a.giris();
		Student s = new Student("Abdullah","Hunter","123456789","196761");
		System.out.println(s.getAdi()+" "+s.getSoyadi()+" "+s.getStudentid()+" numarali ogrenci");
		s.giris();
        Hoca h = new Hoca("MustafaKerem","Sonmemis","555","Profosor","Java,C,C++,Piton ve C#");
        System.out.println(h.getUnvan()+" "+h.getAdi()+" "+h.getSoyadi()+" " +h.getDers()+" derslerini veriyor ");
        h.giris();
        Hoca h1 = new Hoca("MustafaKerem","Sonmemis","555","Profosor","Java ve C#");
        System.out.println(h1.getUnvan()+" "+h1.getAdi()+" "+h1.getSoyadi()+" "+h1.cikis());
	}

}
