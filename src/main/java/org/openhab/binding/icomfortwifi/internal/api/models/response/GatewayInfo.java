/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.icomfortwifi.internal.api.models.response;

import org.openhab.binding.icomfortwifi.internal.api.models.response.CustomTypes.PrefferedLanguage;
import org.openhab.binding.icomfortwifi.internal.api.models.response.CustomTypes.RequestStatus;
import org.openhab.binding.icomfortwifi.internal.api.models.response.CustomTypes.TempUnits;

import com.google.gson.annotations.SerializedName;

/**
 * Response model for the gateway information
 *
 * @author Konstantin Panchenko- Initial contribution
 *
 */
public class GatewayInfo {

    @SerializedName("Cool_Set_Point_High_Limit")
    public Double coolSetPointHighLimit;

    @SerializedName("Cool_Set_Point_Low_Limit")
    public Double coolSetPointLowLimit;

    @SerializedName("Daylight_Savings_Time")
    public Integer daylightSavingsTime;

    @SerializedName("Heat_Cool_Dead_Band")
    public Double heatCoolDeadBand;

    @SerializedName("Heat_Set_Point_High_Limit")
    public Double heatSetPointHighLimit;

    @SerializedName("Heat_Set_Point_Low_Limit")
    public Double heatSetPointLowLimit;

    @SerializedName("Pref_Language_Nbr")
    public PrefferedLanguage prefferedLanguage;

    @SerializedName("Pref_Temp_Unit")
    public TempUnits preferredTemperatureUnit;

    @SerializedName("ReturnStatus")
    public RequestStatus returnStatus;

    @SerializedName("SystemID")
    public Integer systemID;

}
