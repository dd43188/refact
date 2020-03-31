package com.water.shotgun.surgery.middle;

import com.water.shotgun.surgery.Const;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Router {
    /**
     * key   : host
     * value : targetActivity
     */
    Map<String, TargetInfo> entraceMap = new HashMap();

    private void initEntranceMap() {
        //ignore
        entraceMap.put(Const.VIDEO_COLLECTION, new TargetInfo(VideoConnectionActivity.class.getName(), true));
    }

    /**
     * weishi://videoCollection?cid=b5a1acfa12b8b90c6f5575eccdd8cf91&pre_page=1
     */
    public void entrance(String url) {
        String host= getHostFromUrl(url);
        TargetInfo targetInfo = entraceMap.get(host);

        if (targetInfo == null) {
            //do something
        }

        Map<String, String> params = getParamsFromUrl(url);
        startActivity(targetInfo.target, params);
    }


    public boolean isPermitedFromWeb(String host) {
        TargetInfo targetInfo = entraceMap.get(host);
        return targetInfo != null ? targetInfo.safeWithWeb : false;
    }

    private class TargetInfo {
        String target = null;
        boolean safeWithWeb = false;

        TargetInfo(String target, boolean safeWithWeb) {
            this.target = target;
            this.safeWithWeb = safeWithWeb;
        }
    }


    /**
     * 下边是省略的细节
     */

    private Map<String, String> getParamsFromUrl(String url) {
        return null;
    }

    private String getHostFromUrl(String url) {
        return null;
    }

    private void startActivity(String target, Map<String, String> map) {
    }

    private List<String> getActivityList() {
        return null;
    }

}
