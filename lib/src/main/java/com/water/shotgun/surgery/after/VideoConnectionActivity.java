package com.water.shotgun.surgery.after;

import com.water.shotgun.surgery.Const;

import java.util.Map;

@ARouter(path="videoCollection", webSafe="true")
public class VideoConnectionActivity {

    protected void onCreate(Map<String, String> map) {
        String value = map.containsKey(Const.KEY_CID) ? map.get(Const.KEY_CID) : null;
    }
}
