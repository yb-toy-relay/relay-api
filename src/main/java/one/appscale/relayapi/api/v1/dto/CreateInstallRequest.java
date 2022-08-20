package one.appscale.relayapi.api.v1.dto;

import one.appscale.relaycommon.ActivityKind;
import one.appscale.relayschema.domain.ActivityKey;
import one.appscale.relayschema.domain.AppInfo;
import one.appscale.relayschema.domain.AttributionInfo;
import one.appscale.relayschema.domain.ChannelInfo;
import one.appscale.relayschema.domain.DeviceDetail;
import one.appscale.relayschema.domain.DeviceIdInfo;
import one.appscale.relayschema.domain.EngagementInfo;
import one.appscale.relayschema.domain.EnvironmentInfo;
import one.appscale.relayschema.domain.EventInfo;
import one.appscale.relayschema.domain.FacebookReferrerInfo;
import one.appscale.relayschema.domain.install.Install;

import javax.validation.constraints.NotNull;

public record CreateInstallRequest(@NotNull Long createdAt,
                                   @NotNull ActivityKind activityKind,
                                   String appToken,
                                   String appId,
                                   String appName,
                                   String appVersion,
                                   String networkName,
                                   String campaignName,
                                   String adgroupName,
                                   String creativeName,
                                   String adjustId,
                                   String gpsAdid,
                                   String idfa,
                                   String idfv,
                                   Long impressionTime,
                                   Long clickTime,
                                   Long installTime,
                                   Long installBeginTime,
                                   Long installFinishTime,
                                   Long conversionDuration,
                                   String referrer,
                                   String matchType,
                                   String country,
                                   String countrySubdivision,
                                   String city,
                                   String postalCode,
                                   String language,
                                   String deviceName,
                                   String deviceType,
                                   String osName,
                                   String osVersion,
                                   Integer attStatus,
                                   String connectionType,
                                   String isp,
                                   String ipAddress,
                                   Integer impressionAttributionWindow,
                                   Integer clickAttributionWindow,
                                   Integer probmatchingAttributionWindow,
                                   String environment,
                                   String sdkVersion,
                                   String fbRefPublisherPlatform,
                                   String fbRefAdObjective,
                                   String fbRefCampaignGroup,
                                   String fbRefCampaign,
                                   String fbRefAdgroup) {
    public Install toInstall() {
        final ActivityKey activityKey = ActivityKey.newBuilder()
                                                   .setCreatedAt(createdAt)
                                                   .setActivityKind(activityKind.value())
                                                   .build();
        final AppInfo appInfo = AppInfo.newBuilder()
                                       .setAppToken(appToken)
                                       .setAppId(appId)
                                       .setAppName(appName)
                                       .setAppVersion(appVersion)
                                       .build();
        final ChannelInfo channelInfo = ChannelInfo.newBuilder()
                                                   .setNetworkName(networkName)
                                                   .setCampaignName(campaignName)
                                                   .setAdgroupName(adgroupName)
                                                   .setCreativeName(creativeName)
                                                   .build();
        final AttributionInfo attributionInfo = AttributionInfo.newBuilder()
                                                               .setImpressionAttributionWindow(impressionAttributionWindow)
                                                               .setClickAttributionWindow(clickAttributionWindow)
                                                               .setProbmatchingAttributionWindow(probmatchingAttributionWindow)
                                                               .build();
        final EngagementInfo engagementInfo = EngagementInfo.newBuilder()
                                                            .setImpressionTime(impressionTime)
                                                            .setClickTime(clickTime)
                                                            .setInstallTime(installTime)
                                                            .setInstallBeginTime(installBeginTime)
                                                            .setInstallFinishTime(installFinishTime)
                                                            .setConversionDuration(conversionDuration)
                                                            .setReferrer(referrer)
                                                            .setMatchType(matchType)
                                                            .build();
        final DeviceIdInfo deviceIdInfo = DeviceIdInfo.newBuilder()
                                                      .setAdjustId(adjustId)
                                                      .setGpsAdid(gpsAdid)
                                                      .setIdfa(idfa)
                                                      .setIdfv(idfv)
                                                      .build();
        final DeviceDetail deviceDetail = DeviceDetail.newBuilder()
                                                      .setCountry(country)
                                                      .setCountrySubdivision(countrySubdivision)
                                                      .setCity(city)
                                                      .setPostalCode(postalCode)
                                                      .setLanguage(language)
                                                      .setDeviceName(deviceName)
                                                      .setDeviceType(deviceType)
                                                      .setOsName(osName)
                                                      .setOsVersion(osVersion)
                                                      .setAttStatus(attStatus)
                                                      .setConnectionType(connectionType)
                                                      .setIsp(isp)
                                                      .setIpAddress(ipAddress)
                                                      .build();
        final EnvironmentInfo environmentInfo = EnvironmentInfo.newBuilder()
                                                               .setEnvironment(environment)
                                                               .setSdkVersion(sdkVersion)
                                                               .build();
        final FacebookReferrerInfo facebookReferrerInfo = FacebookReferrerInfo.newBuilder()
                                                                              .setFbRefPublisherPlatform(fbRefPublisherPlatform)
                                                                              .setFbRefAdObjective(fbRefAdObjective)
                                                                              .setFbRefCampaignGroup(fbRefCampaignGroup)
                                                                              .setFbRefCampaign(fbRefCampaign)
                                                                              .setFbRefAdgroup(fbRefAdgroup)
                                                                              .build();
        return Install.newBuilder()
                      .setActivityKey(activityKey)
                      .setAppInfo(appInfo)
                      .setChannelInfo(channelInfo)
                      .setAttributionInfo(attributionInfo)
                      .setEngagementInfo(engagementInfo)
                      .setDeviceIdInfo(deviceIdInfo)
                      .setDeviceDetail(deviceDetail)
                      .setEnvironmentInfo(environmentInfo)
                      .setFacebookReferrerInfo(facebookReferrerInfo)
                      .build();
    }
}
