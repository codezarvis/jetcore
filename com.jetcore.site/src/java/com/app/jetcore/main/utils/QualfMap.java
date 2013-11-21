package com.app.jetcore.main.utils;

import com.app.jetcore.context.id.names.ContextIdNames;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/**
 *
 * @author Sudarsan
 */
public class QualfMap {

    private static Logger LOG = Logger.getLogger(QualfMap.class);

    public String getQualf(String qualf) {

        Map<String, String> qualfMap = (HashMap<String, String>) AppContext.APPCONTEXT.getBean(ContextIdNames.HASH_MAP);
        qualfMap.put("ssc", "sscMarks");
        qualfMap.put("intermediate", "intermediateMarks");
        qualfMap.put("graduation", "graduationMarks");
        qualfMap.put("postgraduation", "postGraduationMarks");
        return qualfMap.get(qualf);

    }
}
