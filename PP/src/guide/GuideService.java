package guide;

public interface GuideService {
   public void showMap();    //구글맵으로 위치보여주기
   public void comment();    //가이드유저들의 리뷰평
   public void countryname();//도시이름 선택
   public void mapSize();    //지도 확대,축소
   public void showReview(); //방문했던 유저들의 리뷰보기
   public void placeView();  //주위 즐길거리 리뷰
}
