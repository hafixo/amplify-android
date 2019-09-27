/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amplifyframework.analytics.pinpoint;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.amplifyframework.analytics.AnalyticsEvent;
import com.amplifyframework.analytics.AnalyticsException;
import com.amplifyframework.analytics.AnalyticsPlugin;
import com.amplifyframework.analytics.AnalyticsPluginConfiguration;
import com.amplifyframework.analytics.AnalyticsProfile;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.plugin.PluginException;

/**
 * The plugin implementation for Amazon Pinpoint in Analytics category.
 */
public class AmazonPinpointAnalyticsPlugin implements AnalyticsPlugin {

    private static final String TAG = AmazonPinpointAnalyticsPlugin.class.getSimpleName();

    private Context context;

    public AmazonPinpointAnalyticsPlugin(@NonNull Context context) {
        this.context = context;

        Log.d(TAG, "Amazon Pinpoint Analytics Plugin is initialized.");
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public void recordEvent(@NonNull String eventName) throws AnalyticsException {

    }

    @Override
    public void recordEvent(@NonNull AnalyticsEvent analyticsEvent) throws AnalyticsException {

    }

    @Override
    public void updateProfile(@NonNull AnalyticsProfile analyticsProfile) throws AnalyticsException {

    }


    @Override
    public String getPluginKey() {
        return null;
    }


    @Override
    public void configure(@NonNull AnalyticsPluginConfiguration pluginConfiguration) throws PluginException {

    }

    @Override
    public void configure(@NonNull Context context) throws PluginException {

    }

    @Override
    public void reset() {

    }

    @Override
    public CategoryType getCategoryType() {
        return CategoryType.ANALYTICS;
    }
}