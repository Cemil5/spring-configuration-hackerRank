package com.hackerrank.configstyles.xmlbased;

import com.hackerrank.configstyles.service.ThirdPartyNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:xml_based_bean_configuration.xml"})
public class XmlBasedConfiguration {

    @Autowired
    private ThirdPartyNotificationService thirdPartyNotificationService;

}
