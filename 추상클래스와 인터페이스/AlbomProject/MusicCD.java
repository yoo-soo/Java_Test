
public class MusicCD extends AlbumInfo implements Printable {

	private int price; // 앨범 가격
	private String madeBy; // 음반사
	
	public MusicCD(String artist, String album, int songCount, int price, String madeBy) {
		super(artist, album, songCount); // 가수명, 앨범명, 곡 수는 상위클래스 생성자를 이용해서 초기화
		this.price = price;
		this.madeBy = madeBy;
	}
	
	public int getPrice() { // 가격에 대한 get 메서드
		return this.price;
	}
	
	public void setPrice() { // 가격에 대한 set 메서드
		this.price = price;
	}

	@Override
	public String toString() { // 가수명, 앨범명, 가격, 음반사 문자열로 리턴하는 toString 재정의
		return "가수명 = " + getArtist() + "앨범명 = " + getAlbum() + "앨범가격 =" + getPrice() + ", 음반사 =" + getmadeBy() + "]";
	}

	public String getmadeBy() { // 음반사에 대한 get 메서드
		return this.madeBy;
	}
	
	//equals 메서드 재정의
	public boolean equals() {
		if ( super.equals( madeBy ) ) { // 가수명, 앨범명, 음반사가 같으면
			return true; // 같은 앨범
		} else { // 가수명, 앨범명, 음반사가 다르면
			return false; // 다른 앨범
		}
	}
	
	@Override
	public void printAlbumInfo() { // 앨범 정보를 콘솔로 출력
		// TODO Auto-generated method stub
		System.out.println("------------------------------");
		System.out.println( "가수명 : " + getArtist() );
		System.out.println( "앨범명 : " + getAlbum() );
		System.out.println("곡 : ");
		printSongs();
		System.out.println( "가격 : " + getPrice() );
		System.out.println( "음반사 : " + getmadeBy() );
		System.out.println("------------------------------");
	}
	
	@Override
	public void printTitle() { // TITLE 상수에 해당하는 곡 제목 출력
		// TODO Auto-generated method stub
		System.out.println( getSong( TITLE ) );
	} 

}
