package one.appscale.relayapi.api.v1.dto;

import one.appscale.relaycommon.ActivityKind;
import one.appscale.relayschema.domain.ActivityKey;
import one.appscale.relayschema.domain.AppInfo;
import one.appscale.relayschema.domain.ChannelInfo;
import one.appscale.relayschema.domain.CustomParameter;
import one.appscale.relayschema.domain.DeviceDetail;
import one.appscale.relayschema.domain.DeviceIdInfo;
import one.appscale.relayschema.domain.EnvironmentInfo;
import one.appscale.relayschema.domain.EventInfo;
import one.appscale.relayschema.domain.FacebookReferrerInfo;
import one.appscale.relayschema.domain.event.Event;

import javax.validation.constraints.NotNull;

public record CreateEventRequest(@NotNull Long createdAt,
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
                                 String event,
                                 String eventName,
                                 String currency,
                                 Float revenue,
                                 String environment,
                                 String sdkVersion,
                                 String fbRefPublisherPlatform,
                                 String fbRefAdObjective,
                                 String fbRefCampaignGroup,
                                 String fbRefCampaign,
                                 String fbRefAdgroup,
                                 String adjCustom1,
                                 String adjCustom2,
                                 String adjCustom3,
                                 String adjCustom4,
                                 String adjCustom5) {
    public Event toEvent() {
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
        final EventInfo eventInfo = EventInfo.newBuilder()
                                             .setEvent(event)
                                             .setEventName(eventName)
                                             .setCurrency(currency)
                                             .setRevenue(revenue)
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
        final CustomParameter customParameter = CustomParameter.newBuilder()
                                                               .setAdjCustom1(adjCustom1)
                                                               .setAdjCustom2(adjCustom2)
                                                               .setAdjCustom3(adjCustom3)
                                                               .setAdjCustom4(adjCustom4)
                                                               .setAdjCustom5(adjCustom5)
                                                               .build();
        return Event.newBuilder()
                    .setActivityKey(activityKey)
                    .setAppInfo(appInfo)
                    .setChannelInfo(channelInfo)
                    .setDeviceIdInfo(deviceIdInfo)
                    .setDeviceDetail(deviceDetail)
                    .setEventInfo(eventInfo)
                    .setEnvironmentInfo(environmentInfo)
                    .setFacebookReferrerInfo(facebookReferrerInfo)
                    .setCustomParameter(customParameter)
                    .build();
    }
}
