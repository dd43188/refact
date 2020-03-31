package com.water.shotgun.surgery.before;

import com.water.shotgun.surgery.Const;

import java.util.HashMap;
import java.util.Map;

public class Router {

    /**
     * weishi://videoCollection?cid=b5a1acfa12b8b90c6f5575eccdd8cf91&pre_page=1
     */
    public void entrance(String url) {
        String host = getHostFromUrl(url);

        if (Const.VIDEO_COLLECTION.equals("")) {
            handleVideoCollection(url);
        }
    }

    private void handleVideoCollection(String url) {
        String cid = getStringFromUrl(url, Const.KEY_CID);

        Map<String, String> map = new HashMap<>();
        startActivity(map);
    }

    public boolean isPermitedFromWeb(String host) {
        if (Const.VIDEO_COLLECTION.equals(host)) {
            return true;
        }

        return false;
    }


    /**
     * 下边是省略的细节
     */

    private void startActivity(Map<String, String> map) {
    }

    private String getStringFromUrl(String url, String key) {
        return null;
    }

    private String getHostFromUrl(String url) {
        return null;
    }
}
