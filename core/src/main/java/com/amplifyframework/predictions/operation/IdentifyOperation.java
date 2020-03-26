/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amplifyframework.predictions.operation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.amplifyframework.core.async.AmplifyOperation;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.predictions.models.IdentifyActionType;

import java.util.Objects;

public abstract class IdentifyOperation<R> extends AmplifyOperation<R> {
    private final IdentifyActionType identifyType;

    /**
     * Constructs a new {@link IdentifyOperation}.
     * @param identifyType The type of identification to perform on an image
     * @param amplifyOperationRequest The request object of the operation
     */
    public IdentifyOperation(
            @NonNull IdentifyActionType identifyType,
            @Nullable R amplifyOperationRequest
    ) {
        super(CategoryType.PREDICTIONS, amplifyOperationRequest);
        this.identifyType = Objects.requireNonNull(identifyType);
    }

    /**
     * Gets the type of identification to be performed by this operation.
     * @return the identification type
     */
    @NonNull
    public IdentifyActionType getIdentifyType() {
        return identifyType;
    }
}