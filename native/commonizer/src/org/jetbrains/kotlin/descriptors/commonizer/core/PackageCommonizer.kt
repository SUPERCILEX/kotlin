/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.descriptors.commonizer.core

import org.jetbrains.kotlin.descriptors.commonizer.cir.CirPackage
import org.jetbrains.kotlin.descriptors.commonizer.cir.CirPackageName

class PackageCommonizer : AbstractStandardCommonizer<CirPackage, CirPackage>() {
    private lateinit var packageName: CirPackageName

    override fun commonizationResult() = CirPackage.create(packageName = packageName)

    override fun initialize(first: CirPackage) {
        packageName = first.packageName
    }

    override fun doCommonizeWith(next: CirPackage) = true
}
