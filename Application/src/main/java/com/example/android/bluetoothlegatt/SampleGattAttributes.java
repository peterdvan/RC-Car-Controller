/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static String ENVIRONMENT_DATA= "8c4c7972-c578-11e7-abc4-cec278b6b50a";
    public static String MOVEMENT_DATA= "1639892c-c803-11e7-abc4-cec278b6b50a";
    public static String DIRECTION_CHARACTERISTIC= "9f14d1a6-c804-11e7-abc4-cec278b6b50a";
    public static String ACCELERATION_CHARACTERISTIC= "1639892c-c803-11e7-abc4-cec278b6b50a";
    public static String BRIGHTNESS_CHARACTERISTIC= "16398cd8-c803-11e7-abc4-cec278b6b50a";
    public static String FORWARD_DISTANCE_SENSOR_CHARACTERISTIC= "16398bca-c803-11e7-abc4-cec278b6b50a";
    public static String SENSOR_ONE= "16398bca-c803-11e7-abc4-cec278b6b50a";
    public static String SENSOR_TWO= "16398bc7-c803-11e7-abc4-cec278b6b50a";
    public static String SENSOR_THREE= "16398bc8-c803-11e7-abc4-cec278b6b50a";
    public static String SENSOR_FOUR= "16398bc9-c803-11e7-abc4-cec278b6b50a";
    public static String SENSOR_FIVE= "16398bc4-c803-11e7-abc4-cec278b6b50a";
    public static String TEMPERATURE_DATA= "16398bac-c803-11e7-abc4-cec278b6b50a";
    public static String MASTER_TO_SLAVE= "16388bac-c803-11e7-abc4-cec278b6b50a";
    public static String SLAVE_T0_MASTER= "16399bac-c803-11e7-abc4-cec278b6b50a";
    static {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        attributes.put(ENVIRONMENT_DATA, "Environment Information Service");
        attributes.put(MOVEMENT_DATA, "Movement Information Service");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put("1639892c-c803-11e7-abc4-cec278b6b50a", "Manufacturer Name String");

    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
