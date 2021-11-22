
public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicCD m1 = new MusicCD("psy", "champion", 10, 12000, "sony");
		MusicCD m2 = new MusicCD("조PD", "친구여", 8, 11000, "sony");
	
		// equals 메소드로 비교 후 같으면 같은음반, 다르면 다른음반 출력
		if ( m1.equals(m2)) {
			System.out.println("같은 음반");
		} else {
			System.out.println("다른 음반");
		}
		
		System.out.println(m1.toString()); // 음반 정보 출력
		
		m1.addSong("새"); // 노래 '새' 저장
		m1.printAlbumInfo(); // 앨범정보 출력
		m1.addSong("챔피언"); // 노래 '챔피언' 저장
		m1.printAlbumInfo();
		m1.addSong("강남스타일"); // 노래 '강남스타일' 저장
		m1.printAlbumInfo(); 
		
		m1.setArtist("싸이"); // 가수명 변경
		m1.printAlbumInfo();
		
		m1.printTitle(); // 타이틀곡 출력
		
	}
}
