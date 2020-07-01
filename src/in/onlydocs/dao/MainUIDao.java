package in.onlydocs.dao;

import java.sql.SQLException;
import java.util.List;

import in.onlydocs.bean.Facilities;
import in.onlydocs.bean.GalleryBean;
import in.onlydocs.bean.NewsAndEventBean;

public interface MainUIDao {
	public List<GalleryBean> getSliderImages() throws SQLException;
	public boolean saveAdmissionEnquiryDetails() throws SQLException;
	public List<Facilities> getExtraCurricularActivities() throws SQLException;
	public List<Facilities> getFacilities() throws SQLException;
	public List<NewsAndEventBean> getNewsEvents() throws SQLException;
}
