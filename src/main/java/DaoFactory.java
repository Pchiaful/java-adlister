public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySqlAdsDao(new Config());
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }
}


