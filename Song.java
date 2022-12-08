class Song {

	private String title;
	private String artist;
	private int length;

	public Song(String t, String a, int l) {

		this.title = t;
		this.artist = a;
		this.length = l;
	} // 생성자 중복 정의

	public Song(String t, String a) {
		this.title = t;
		this.artist = a;
	}

	public Song(String t) {
		this.title = t;
	}

	public Song() {
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", length=" + length + "]";
	}

}
