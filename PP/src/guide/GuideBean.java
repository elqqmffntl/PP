package guide;

/**
 * @date   : 2016. 6. 22. 
 * @author : 한상호
 * @file   : Guide.java
 * @story  : 
*/
/**
 * gogleMap:구글맵
 * hostinguser:이용했던유저
 * Countryname:도시이름
 * explanation:선택지역 설명
 * hotplace:주위 즐길거리
 * zoom:지도확대
 * reduction:지도축소
 * */
public class GuideBean {
private String gogleMap,hostinguser,countryname,explanation,hotplace,zoom,reduction;


public String getCountryname() {
	return countryname;
}

public void setCountryname(String countryname) {
	this.countryname = countryname;
}

public String getExplanation() {
	return explanation;
}

public void setExplanation(String explanation) {
	this.explanation = explanation;
}

public String getHotplace() {
	return hotplace;
}

public void setHotplace(String hotplace) {
	this.hotplace = hotplace;
}

public String getZoom() {
	return zoom;
}

public void setZoom(String zoom) {
	this.zoom = zoom;
}

public String getReduction() {
	return reduction;
}

public void setReduction(String reduction) {
	this.reduction = reduction;
}

public String getGogleMap() {
	return gogleMap;
}

public void setGogleMap(String gogleMap) {
	this.gogleMap = gogleMap;
}

public String getHostinguser() {
	return hostinguser;
}

public void setHostinguser(String hostinguser) {
	this.hostinguser = hostinguser;
}
}
