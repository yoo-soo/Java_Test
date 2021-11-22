
public class AlbumInfo {
	private String artist; // 가수명
	private String album; // 앨범명
	private String[] songs; // 곡
	private int index; // 인덱스
	
	// 생성자
	public AlbumInfo( String artist, String album ) {
		this.artist = artist;
		this.album = album;
		this.songs = new String[10]; // 곡 수가 없을 경우 기본 10곡을 저장할 수 있는 배열 생성
	}
	
	public AlbumInfo( String artist, String album, int songCount ) {
		this.artist = artist;
		this.album = album;
		this.songs = new String[songCount]; // 곡 수에 따라 저장할 수 있는 배열 생성
		this.index = 0; // 인덱스 0으로 초기화
	}
	
	// 기본 메서드
	public String getArtist() { // 가수명에 대한 get 메서드
		return this.artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getAlbum() { // 앨범명에 대한 get 메서드
		return this.album;
	}
	
	public String toString() { // 가수명과 앨범명을 문자열로 리턴하는 toString 메서드
		return "[ 가수명 =" + getArtist() + ", 앨범명 =" + getAlbum() + "]";
	}
	
	public void setAlbum(String album) { // 앨범명에 대한 set 메서드
		this.album = album;
	}
	
	//앨범 비교를 위한 equals 메서드
	public boolean equals(String artist, String album) {
		if ( artist.equals(album) ) { // 가수명과 앨범명이 같으면 
			return true; // 같은 앨범 
		} else { // 가수명과 앨범명이 다르면
			return false; // 다른 앨범
		}
	}

	// 기타 메서드 
	public void addSong ( String song ) { // 곡 추가를 위한 addSong 메서드
		if ( index < songs.length ) { // 곡 배열의 0번째 인덱스부터
			this.songs[index++] = song; // 문자열 저장하고 인덱스 증가.
		}else // index값을 이용 배열 범위를 벗어나면 
			System.out.println("더 이상 저장 불가."); // 곡 저장 불가.
		}
	
	public String getSong( int index ) {
		//배열의 지정위치에 있는 곡명을 리턴하는 getSong 메서드
		return songs[index];
	}
	
	public void printSongs() { // 곡 목록을 출력하는 메서드
		for ( int i = 0; i < index; i++) {
			System.out.println( "[" + (i+1) + "] " + songs[i] ); // songs 배열의 곡들을 출력
		}
	}
}
