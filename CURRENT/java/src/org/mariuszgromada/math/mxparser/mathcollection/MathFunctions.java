/*
 * @(#)MathFunctions.java        5.0.7    2022-08-16
 *
 * MathParser.org-mXparser DUAL LICENSE AGREEMENT as of date 2022-05-22
 * The most up-to-date license is available at the below link:
 * - https://mathparser.org/mxparser-license
 *
 * AUTHOR: Copyright 2010 - 2022 Mariusz Gromada - All rights reserved
 * PUBLISHER: INFIMA - https://payhip.com/infima
 *
 * SOFTWARE means source code and/or binary form and/or documentation.
 * PRODUCT: MathParser.org-mXparser SOFTWARE
 * LICENSE: DUAL LICENSE AGREEMENT
 *
 * BY INSTALLING, COPYING, OR OTHERWISE USING THE PRODUCT, YOU AGREE TO BE
 * BOUND BY ALL OF THE TERMS AND CONDITIONS OF THE DUAL LICENSE AGREEMENT.
 *
 * AUTHOR & PUBLISHER provide the PRODUCT under the DUAL LICENSE AGREEMENT
 * model designed to meet the needs of both non-commercial use as well as
 * commercial use.
 *
 * NON-COMMERCIAL USE means any use or activity where a fee is not charged
 * and the purpose is not the sale of a good or service, and the use or
 * activity is not intended to produce a profit. NON-COMMERCIAL USE examples:
 *
 * 1. Free Open-Source Software ("FOSS").
 * 2. Non-commercial use in research, scholarly and education.
 *
 * COMMERCIAL USE means any use or activity where a fee is charged or the
 * purpose is the sale of a good or service, or the use or activity is
 * intended to produce a profit. COMMERCIAL USE examples:
 *
 * 1. OEMs (Original Equipment Manufacturers).
 * 2. ISVs (Independent Software Vendors).
 * 3. VARs (Value Added Resellers).
 * 4. Other distributors that combine and distribute commercially licensed
 *    software.
 *
 * IN CASE YOU WANT TO USE THE PRODUCT COMMERCIALLY, YOU MUST PURCHASE THE
 * APPROPRIATE LICENSE FROM "INFIMA" ONLINE STORE, STORE ADDRESS:
 *
 * 1. https://mathparser.org/order-commercial-license
 * 2. https://payhip.com/infima
 *
 * NON-COMMERCIAL LICENSE
 *
 * Redistribution and use of the PRODUCT in source and/or binary forms,
 * with or without modification, are permitted provided that the following
 * conditions are met:
 *
 * 1. Redistributions of source code must retain unmodified content of the
 *    entire MathParser.org-mXparser DUAL LICENSE AGREEMENT, including
 *    definition of NON-COMMERCIAL USE, definition of COMMERCIAL USE,
 *    NON-COMMERCIAL LICENSE conditions, COMMERCIAL LICENSE conditions, and
 *    the following DISCLAIMER.
 * 2. Redistributions in binary form must reproduce the entire content of
 *    MathParser.org-mXparser DUAL LICENSE AGREEMENT in the documentation
 *    and/or other materials provided with the distribution, including
 *    definition of NON-COMMERCIAL USE, definition of COMMERCIAL USE,
 *    NON-COMMERCIAL LICENSE conditions, COMMERCIAL LICENSE conditions, and
 *    the following DISCLAIMER.
 * 3. Any form of redistribution requires confirmation and signature of
 *    the NON-COMMERCIAL USE by successfully calling the method:
 *       License.iConfirmNonCommercialUse(...)
 *    The method call takes place only internally for logging purposes and
 *    there is no connection with other external services and no data is
 *    sent or collected. The lack of a method call (or its successful call)
 *    does not affect the operation of the PRODUCT in any way. Please see
 *    the API documentation.
 *
 * COMMERCIAL LICENSE
 *
 *  1. Before purchasing a commercial license, AUTHOR & PUBLISHER allow you
 *     to download, install and use up to three copies of the PRODUCT to
 *     perform integration tests, confirm the quality of the PRODUCT and
 *     its suitability. The testing period should be limited to fourteen
 *     days. Tests should be performed under the conditions of test
 *     environments. The purpose of the tests must not be to generate profit.
 *  2. Provided that you purchased a license from "INFIMA" online store
 *     (store address: https://mathparser.org/order-commercial-license or
 *     https://payhip.com/infima), and you comply with all below terms and
 *     conditions, and you have acknowledged and understood the following
 *     DISCLAIMER, AUTHOR & PUBLISHER grant you a nonexclusive license
 *     including the following rights:
 *  3. The license has been granted only to you, i.e., the person or entity
 *     that made the purchase, who is identified and confirmed by the data
 *     provided during the purchase.
 *  4. In case you purchased a license in the "ONE-TIME PURCHASE" model,
 *     the license has been granted only for the PRODUCT version specified
 *     in the purchase. The upgrade policy gives you additional rights and
 *     is described in the dedicated section below.
 *  5. In case you purchased a license in the "SUBSCRIPTION" model, you can
 *     install and use any version of the PRODUCT, but only during the
 *     subscription validity period.
 *  6. In case you purchased a "SINGLE LICENSE" you can install and use the
 *     PRODUCT from one workstation.
 *  7. Additional copies of the PRODUCT can be installed and used from more
 *     than one workstation; however, this number is limited to the number
 *     of workstations purchased as per order.
 *  8. In case you purchased a "SITE LICENSE ", the PRODUCT can be installed
 *     and used from all workstations located at your premises.
 *  9. You may incorporate the unmodified PRODUCT into your own products
 *     and software.
 * 10. If you purchased a license with the "SOURCE CODE" option, you may
 *     modify the PRODUCT's source code and incorporate the modified source
 *     code into your own products and/or software.
 * 11. Provided that the license validity period has not expired, you may
 *     distribute your product and/or software with the incorporated
 *     PRODUCT royalty-free.
 * 12. You may make copies of the PRODUCT for backup and archival purposes.
 * 13. Any form of redistribution requires confirmation and signature of
 *     the COMMERCIAL USE by successfully calling the method:
 *        License.iConfirmCommercialUse(...)
 *     The method call takes place only internally for logging purposes and
 *     there is no connection with other external services and no data is
 *     sent or collected. The lack of a method call (or its successful call)
 *     does not affect the operation of the PRODUCT in any way. Please see
 *     the API documentation.
 * 14. AUTHOR & PUBLISHER reserve all rights not expressly granted to you
 *     in this agreement.
 *
 * ADDITIONAL CLARIFICATION ON WORKSTATION
 *
 * A workstation is a device, a remote device, or a virtual device, used by
 * you, your employees, or other entities to whom you have commissioned the
 * tasks. For example, the number of workstations may refer to the number
 * of software developers, engineers, architects, scientists, and other
 * professionals who use the PRODUCT on your behalf. The number of
 * workstations is not the number of copies of your end-product that you
 * distribute to your end-users.
 *
 * By purchasing the COMMERCIAL LICENSE, you only pay for the number of
 * workstations, while the number of copies of your final product
 * (delivered to your end-users) is not limited.
 *
 * UPGRADE POLICY
 *
 * The PRODUCT is versioned according to the following convention:
 *
 *    [MAJOR].[MINOR].[PATCH]
 *
 * 1. COMMERCIAL LICENSE holders can install and use the updated version
 *    for bug fixes free of charge, i.e. if you have purchased a license
 *    for the [MAJOR].[MINOR] version (e.g.: 5.0), you can freely install
 *    all the various releases specified in the [PATCH] version (e.g.: 5.0.2).
 *    The license terms remain unchanged after the update.
 * 2. COMMERCIAL LICENSE holders for [MAJOR].[MINOR] version (e.g.: 5.0)
 *    can install and use the updated version [MAJOR].[MINOR + 1] free of
 *    charge, i.e., plus one release in the [MINOR] range (e.g.: 5.1). The
 *    license terms remain unchanged after the update.
 * 3. COMMERCIAL LICENSE holders who wish to upgrade their version, but are
 *    not eligible for the free upgrade, can claim a discount when
 *    purchasing the upgrade. For this purpose, please contact us via e-mail.
 *
 * DISCLAIMER
 *
 * THIS PRODUCT IS PROVIDED BY AUTHOR & PUBLISHER "AS IS" AND ANY EXPRESS
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL AUTHOR OR PUBLISHER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS PRODUCT, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 *
 * THE VIEWS AND CONCLUSIONS CONTAINED IN THE PRODUCT AND DOCUMENTATION ARE
 * THOSE OF THE AUTHORS AND SHOULD NOT BE INTERPRETED AS REPRESENTING
 * OFFICIAL POLICIES, EITHER EXPRESSED OR IMPLIED, OF AUTHOR OR PUBLISHER.
 *
 * CONTACT
 *
 * - e-mail: info@mathparser.org
 * - website: https://mathparser.org
 * - source code: https://github.com/mariuszgromada/MathParser.org-mXparser
 * - online store: https://mathparser.org/order-commercial-license
 * - online store: https://payhip.com/infima
 */
package org.mariuszgromada.math.mxparser.mathcollection;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import org.mariuszgromada.math.mxparser.mXparser;

/**
 * MathFunctions - the most popular math functions. Many of function implemented by this class
 * could be found in java Math package (in fact functions from MathFunctions typically calls
 * original functions from the Math package). The reason why it was "re-implemented" is:
 * if you decide to implement your own function you do not need to change anything in the parser,
 * jut modify function implementation in this class.
 *
 * @author         <b>Mariusz Gromada</b><br>
 *                 <a href="https://mathparser.org" target="_blank">MathParser.org - mXparser project page</a><br>
 *                 <a href="https://github.com/mariuszgromada/MathParser.org-mXparser" target="_blank">mXparser on GitHub</a><br>
 *                 <a href="https://payhip.com/INFIMA" target="_blank">INFIMA place to purchase a commercial MathParser.org-mXparser software license</a><br>
 *                 <a href="mailto:info@mathparser.org">info@mathparser.org</a><br>
 *                 <a href="https://scalarmath.org/" target="_blank">ScalarMath.org - a powerful math engine and math scripting language</a><br>
 *                 <a href="https://play.google.com/store/apps/details?id=org.mathparser.scalar.lite" target="_blank">Scalar Lite</a><br>
 *                 <a href="https://play.google.com/store/apps/details?id=org.mathparser.scalar.pro" target="_blank">Scalar Pro</a><br>
 *                 <a href="https://mathspace.pl" target="_blank">MathSpace.pl</a><br>
 *
 * @version        5.0.7
 */
public final class MathFunctions {
	private static int MAX_RECURSION_CALLS = mXparser.getMaxAllowedRecursionDepth();
	private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH)) {{setMaximumFractionDigits(340);}};

	private static void refreshMaxAllowedRecursionDepth() {
		MAX_RECURSION_CALLS = mXparser.getMaxAllowedRecursionDepth();
	}
	/**
	 * Addition a + b applying canonical rounding if canonical
	 * rounding is enabled
	 *
	 * @param a  The a parameter
	 * @param b  The b parameter
	 * @return   The result of addition
	 */
	public static double plus(double a, double b) {
		if (Double.isNaN(a)) return Double.NaN;
		if (Double.isNaN(b)) return Double.NaN;
		if (!mXparser.checkIfCanonicalRounding()) return a + b;
		if (Double.isInfinite(a)) return a + b;
		if (Double.isInfinite(b)) return a + b;
		BigDecimal da = BigDecimal.valueOf(a);
		BigDecimal db = BigDecimal.valueOf(b);
		return da.add(db).doubleValue();
	}
	/**
	 * Subtraction a - b applying canonical rounding if canonical
	 * rounding is enabled
	 *
	 * @param a  The a parameter
	 * @param b  The b parameter
	 * @return   The result of subtraction
	 */
	public static double minus(double a, double b) {
		if (Double.isNaN(a)) return Double.NaN;
		if (Double.isNaN(b)) return Double.NaN;
		if (!mXparser.checkIfCanonicalRounding()) return a - b;
		if (Double.isInfinite(a)) return a - b;
		if (Double.isInfinite(b)) return a - b;
		BigDecimal da = BigDecimal.valueOf(a);
		BigDecimal db = BigDecimal.valueOf(b);
		return da.subtract(db).doubleValue();
	}
	/**
	 * Multiplication a * b applying canonical rounding if canonical
	 * rounding is enabled
	 *
	 * @param a  The a parameter
	 * @param b  The b parameter
	 * @return   The result of multiplication
	 */
	public static double multiply(double a, double b) {
		if (Double.isNaN(a)) return Double.NaN;
		if (Double.isNaN(b)) return Double.NaN;
		if (!mXparser.checkIfCanonicalRounding()) return a * b;
		if (Double.isInfinite(a)) return a * b;
		if (Double.isInfinite(b)) return a * b;
		BigDecimal da = BigDecimal.valueOf(a);
		BigDecimal db = BigDecimal.valueOf(b);
		return da.multiply(db).doubleValue();
	}
	/**
	 * Division a / b applying canonical rounding if canonical
	 * rounding is enabled
	 *
	 * @param a  The a parameter
	 * @param b  The b parameter
	 * @return   The result of division
	 */
	public static double div(double a, double b) {
		if (b == 0) return Double.NaN;
		if (Double.isNaN(a)) return Double.NaN;
		if (Double.isNaN(b)) return Double.NaN;
		if (!mXparser.checkIfCanonicalRounding()) return a / b;
		if (Double.isInfinite(a)) return a / b;
		if (Double.isInfinite(b)) return a / b;
		BigDecimal da = BigDecimal.valueOf(a);
		BigDecimal db = BigDecimal.valueOf(b);
		try {
			return da.divide(db, MathContext.DECIMAL128).doubleValue();
		} catch (Throwable e) {
			return a / b;
		}
	}
	/**
	 * Bell Numbers
	 *
	 * @param      n                   the n
	 *
	 * @return     if n &gt;= 0 returns Bell numbers,
	 *             otherwise returns Double.NaN.
	 */
	public static double bellNumber(int n) {
		double result = Double.NaN;
		if (n > 1) {
			n -= 1;
			if ( (n+1)*(n+1) >= Integer.MAX_VALUE ) return Double.NaN;
			long[][] bellTriangle = new long[n+1][n+1];
			bellTriangle[0][0] = 1;
			bellTriangle[1][0] = 1;
			for (int r = 1; r <= n; r++) {
				for (int k = 0; k < r; k++)
					bellTriangle[r][k+1] = bellTriangle[r-1][k] + bellTriangle[r][k];
				if (r < n)
					bellTriangle[r+1][0] = bellTriangle[r][r];
				if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
			}
			result = bellTriangle[n][n];
		} else if (n >= 0)
			result = 1;
		return result;
	}
	/**
	 * Bell number
	 * @param      n                   the n
	 *
	 * @return     if n &lt;&gt; Double.NaN return bellNumber( (int)Math.round(n) ),
	 *             otherwise return Double.NaN.
	 */
	public static double bellNumber(double n) {
		if (Double.isNaN(n))
			return Double.NaN;
		return bellNumber( (int)Math.round(n) );
	}
	/**
	 * Euler numbers
	 *
	 * @param      n                   the n function param
	 * @param      k                   the k function param
	 *
	 * @return     if n &gt;=0 returns Euler number,
	 *             otherwise return Double.NaN.
	 *             Returns also Double.NaN when MAX RECURSION CALLS
	 *             is exceeded.
	 *
	 * @see mXparser#getMaxAllowedRecursionDepth()
	 * @see mXparser#setMaxAllowedRecursionDepth(int)
	 */
	public static double eulerNumber(int n, int k) {
		refreshMaxAllowedRecursionDepth();
		return eulerNumber(n, k, 1);
	}
	private static double eulerNumber(int n, int k, int recursionCall) {
		if (recursionCall > MAX_RECURSION_CALLS)
			return Double.NaN;
		if (n < 0)
			return Double.NaN;
		if (k < 0)
			return 0;
		if (n == 0)
			if (k == 0)
				return 1;
			else
				return 0;
		if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		double e1 = eulerNumber(n - 1, k, recursionCall+1);
		if (Double.isNaN(e1))
			return Double.NaN;
		double e2 = eulerNumber(n - 1, k - 1, recursionCall + 1);
		if (Double.isNaN(e2))
			return Double.NaN;
		return (k + 1) * e1 + (n - k) * e2;
	}

	/**
	 * Euler numbers
	 *
	 * @param      n                   the n function param
	 * @param      k                   the k function param
	 *
	 * @return     if n, k &lt;&gt; Double.NaN returns eulerNumber( (int)Math.round(n), (int)Math.round(k) ),
	 *             otherwise return Double.NaN.
	 */
	public static double eulerNumber(double n, double k) {
		if (Double.isNaN(n) || Double.isNaN(k))
			return Double.NaN;
		return eulerNumber( (int)Math.round(n), (int)Math.round(k) );
	}
	/**
	 * Factorial
	 *
	 * @param      n                   the n function parameter
	 *
	 * @return     Factorial if n &gt;=0, otherwise returns Double.NaN.
	 */
	public static double factorial(int n) {
		double f = Double.NaN;
		if (n >= 0)
			if (n < 2) f = 1;
			else {
				f = 1;
				for (int i = 1; i <= n; i++) {
					f = f*i;
					if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
				}
			}
		return f;
	}
	/**
	 * Factorial
	 *
	 * @param      n                   the n function parameter
	 *
	 * @return     if n &lt;&gt; Double.NaN return factorial( (int)Math.round(n) ),
	 *             otherwise returns Double.NaN.
	 */
	public static double factorial(double n) {
		if (Double.isNaN(n))
			return Double.NaN;
		return factorial( (int)Math.round(n) );
	}
	/**
	 * Falling factorial polynomial
	 * @param x  Argument
	 * @param n  Polynomial degree
	 * @return   Falling factorial polynomial of degree n at point x
	 */
	public static double factorialFalling(double x, double n){
		if (Double.isNaN(x)) return Double.NaN;
		if (Double.isNaN(n)) return Double.NaN;
		if (n < 0) return Double.NaN;
		if (BinaryRelations.isEqualOrAlmost(n, 0)) return 1.0;
		double k, y;
		y = 1;
		for (k = 0; k <= n - 1; k = k + 1) {
			if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
			y = y * (x - k);
		}
		return y;
	}
	/**
	 * Rising factorial polynomial
	 * @param x  Argument
	 * @param n  Polynomial degree
	 * @return   Rising factorial polynomial of degree n at point x
	 */
	public static double factorialRising(double x, double n){
		if (Double.isNaN(x)) return Double.NaN;
		if (Double.isNaN(n)) return Double.NaN;
		if (n < 0) return Double.NaN;
		if (BinaryRelations.isEqualOrAlmost(n, 0)) return 1.0;
		double k, y;
		y = 1;
		for (k = 0; k <= n - 1; k = k + 1) {
			if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
			y = y * (x + k);
		}
		return y;
	}
	/**
	 * Generalized binomial coefficient
	 *
	 * @param      n                   the n function parameter
	 * @param k    k                   the k function parameter
	 *
	 * @return     Generalized binomial coefficient, if
	 *             n = Double.NaN or k &lt; 0 returns Double.NaN.
	 */
	public static double binomCoeff(double n, long k) {
		if (Double.isNaN(n))
			return Double.NaN;
		double result = Double.NaN;
		if ( k >= 0 ){
			double numerator = 1;
			if (k > 0 )
				for (long i = 0; i <= k-1; i++) {
					numerator*=(n-i);
					if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
				}
			double denominator = 1;
			if ( k > 1 )
				for (long i = 1; i <= k; i++) {
					denominator *= i;
					if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
				}
			result = numerator / denominator;
		}
		return result;
	}
	/**
	 * Generalized binomial coefficient
	 *
	 * @param      n                   the n function parameter
	 * @param      k                   the k function parameter
	 *
	 * @return     if n, k &lt;&gt; Double.NaN returns binomCoeff(n, (int)Math.round(k) ),
	 *             otherwise returns Double.NaN.
	 */
	public static double binomCoeff(double n, double k) {
		if (Double.isNaN(n) || Double.isNaN(k))
			return Double.NaN;
		return binomCoeff(n, (long)Math.round(k) );
	}
	/**
	 * Generalized coefficient returning number of k permutations
	 * that can be drawn for n elements set.
	 *
	 * @param      n                   the n function parameter
	 * @param      k                   the k function parameter
	 *
	 * @return   For k greater than 0 return number of permutations, otherwise
	 *           returns Double.NaN
	 */
	public static double numberOfPermutations(double n, long k) {
		if (Double.isNaN(n))
			return Double.NaN;
		double result = Double.NaN;
		if ( k >= 0 ){
			double numerator = 1;
			if (k > 0 )
				for (long i = 0; i <= k-1; i++) {
					numerator*=(n-i);
					if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
				}
			result = numerator;
		}
		return result;
	}
	/**
	 * Generalized coefficient returning number of k permutations
	 * that can be drawn for n elements set.
	 *
	 * @param      n                   the n function parameter
	 * @param      k                   the k function parameter
	 *
	 * @return   For k greater than 0 return number of permutations, otherwise
	 *           returns Double.NaN
	 */
	public static double numberOfPermutations(double n, double k) {
		if (Double.isNaN(n) || Double.isNaN(k))
			return Double.NaN;
		return numberOfPermutations(n, (long)Math.round(k) );
	}
	/**
	 * Bernoulli numbers
	 *
	 * @param      m                   the m function parameter
	 * @param      n                   the n function parameter
	 *
	 * @return     if n, m &gt;= 0 returns Bernoulli number,
	 *             otherwise returns Double.NaN.
	 */
	public static double bernoulliNumber(int m, int n) {
		double result = Double.NaN;
		if ( (m >= 0) && (n >= 0) ) {
			result = 0;
			for (int k = 0; k <= m; k++)
				for (int v = 0; v <= k; v++) {
					result += Math.pow(-1, v) * binomCoeff(k, v)
						* ( Math.pow(n + v, m) / (k + 1) );
					if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
				}
		}
		return result;
	}
	/**
	 * Bernoulli numbers
	 *
	 * @param      m                   the m function parameter
	 * @param      n                   the n function parameter
	 *
	 * @return     if n, m &lt;&gt; Double.NaN returns bernoulliNumber( (int)Math.round(m), (int)Math.round(n) ),
	 *             otherwise returns Double.NaN.
	 */
	public static double bernoulliNumber(double m, double n) {
		if (Double.isNaN(m) || Double.isNaN(n))
			return Double.NaN;
		return bernoulliNumber( (int)Math.round(m), (int)Math.round(n) );
	}
	/**
	 * Stirling numbers of the first kind
	 *
	 * @param      n                   the n function parameter
	 * @param      k                   the k function parameter
	 *
	 * @return     Stirling numbers of the first kind
	 *             Returns also Double.NaN when MAX RECURSION CALLS
	 *             is exceeded.
	 *
	 * @see mXparser#getMaxAllowedRecursionDepth()
	 * @see mXparser#setMaxAllowedRecursionDepth(int)
	 */
	public static double Stirling1Number(int n, int k) {
		refreshMaxAllowedRecursionDepth();
		return Stirling1Number(n, k, 1);
	}
	private static double Stirling1Number(int n, int k, int recursionCall) {
		if (recursionCall > MAX_RECURSION_CALLS)
			return Double.NaN;
		if (k > n)
			return 0;
		if (n == 0)
			if (k == 0)
				return 1;
			else
				return 0;
		if (k == 0)
			if (n == 0)
				return 1;
			else
				return 0;
		if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		double s1 = Stirling1Number(n - 1, k, recursionCall + 1);
		if (Double.isNaN(s1))
			return Double.NaN;
		double s2 = Stirling1Number(n - 1, k - 1, recursionCall + 1);
		if (Double.isNaN(s2))
			return Double.NaN;
		return (n - 1) * s1 + s2;
	}
	/**
	 * Stirling numbers of the first kind
	 *
	 * @param      n                   the n function parameter
	 * @param      k                   the k function parameter
	 *
	 * @return     if n, k &lt;&gt; Doube.NaN returns Stirling1Number( (int)Math.round(n), (int)Math.round(k) ),
	 *             otherwise returns Double.NaN.
	 */
	public static double Stirling1Number(double n, double k) {
		if (Double.isNaN(n) || Double.isNaN(k))
			return Double.NaN;
		return Stirling1Number( (int)Math.round(n), (int)Math.round(k) );
	}
	/**
	 * Stirling numbers of the second kind
	 *
	 * @param      n                   the n function parameter
	 * @param      k                   the k function parameter
	 *
	 * @return     Stirling numbers of the second kind
	 *             Returns also Double.NaN when MAX RECURSION CALLS
	 *             is exceeded.
	 *
	 * @see mXparser#getMaxAllowedRecursionDepth()
	 * @see mXparser#setMaxAllowedRecursionDepth(int)
	 */
	public static double Stirling2Number(int n, int k) {
		refreshMaxAllowedRecursionDepth();
		return Stirling2Number(n, k, 1);
	}
	private static double Stirling2Number(int n, int k, int recursionCall) {
		if (recursionCall > MAX_RECURSION_CALLS)
			return Double.NaN;
		if (k > n)
			return 0;
		if (n == 0)
			if (k == 0)
				return 1;
			else
				return 0;
		if (k == 0)
			if (n == 0)
				return 1;
			else
				return 0;
		if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		double s1 = Stirling2Number(n - 1, k, recursionCall + 1);
		if (Double.isNaN(s1))
			return Double.NaN;
		double s2 = Stirling2Number(n - 1, k - 1, recursionCall + 1);
		if (Double.isNaN(s2))
			return Double.NaN;
		return k * s1 + s2;
	}
	/**
	 * Stirling numbers of the second kind
	 *
	 * @param      n                   the n function parameter
	 * @param      k                   the k function parameter
	 *
	 * @return     if n, k &lt;&gt; Doube.NaN returns Stirling2Number( (int)Math.round(n), (int)Math.round(k) ),
	 *             otherwise returns Double.NaN.
	 */
	public static double Stirling2Number(double n, double k) {
		if (Double.isNaN(n) || Double.isNaN(k))
			return Double.NaN;
		return Stirling2Number( (int)Math.round(n), (int)Math.round(k) );
	}
	/**
	 * Worpitzky numbers
	 *
	 * @param      n                   the n function parameter
	 * @param      k                   the k function parameter
	 *
	 * @return     if n,k &gt;= 0 and k &lt;= n return Worpitzky number,
	 *             otherwise return Double.NaN.
	 */
	public static double worpitzkyNumber(int n, int k) {
		double result = Double.NaN;
		if ( (n >= 0) && (k >= 0) && (k <= n) ){
			result = 0;
			for (int v = 0; v <= k; v++) {
				result += Math.pow(-1, v+k) * Math.pow(v+1, n) * binomCoeff(k, v);
				if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
			}
		}
		return result;
	}
	/**
	 * Worpitzky numbers
	 *
	 * @param      n                   the n function parameter
	 * @param      k                   the k function parameter
	 *
	 * @return     if n,k &lt;&gt; Double.NaN returns worpitzkyNumber( (int)Math.round(n), (int)Math.round(k) ),
	 *             otherwise return Double.NaN.
	 */
	public static double worpitzkyNumber(double n, double k) {
		if (Double.isNaN(n) || Double.isNaN(k))
			return Double.NaN;
		return worpitzkyNumber( (int)Math.round(n), (int)Math.round(k) );
	}
	/**
	 * Harmonic numer
	 *
	 * @param      n                   the n function parameter
	 *
	 * @return     if n &gt; 0 returns harmonic number, otherwise returns 0
	 *             (empty summation operator)
	 */
	public static double harmonicNumber(int n) {
		if (n <= 0)
			return 0;
		if (n == 1)
			return 1;
		double h = 1;
		for (double k = 2.0; k <= n; k++) {
			h += 1.0 / k;
			if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		}
		return h;
	}
	/**
	 * Harmonic number
	 *
	 * @param      n                   the n function parameter
	 *
	 * @return     if n &lt;&gt; Double.NaN returns harmonicNumber( (int)Math.round(n) ),
	 *             otherwise returns Double.NaN
	 */
	public static double harmonicNumber(double n) {
		if (Double.isNaN(n))
			return Double.NaN;
		return harmonicNumber( (int)Math.round(n) );
	}
	/**
	 * Harmonic number 1/1 + 1/2^x + ... + 1/n^x
	 *
	 * @param      x                   the x function parameter
	 * @param      n                   the n function parameter
	 *
	 * @return     if x &lt;&gt; Double.NaN and x &gt;= 0 Harmonic number,
	 *             otherwise returns Double.NaN.
	 */
	public static double harmonicNumber(double x, int n) {
		if  ( (Double.isNaN(x)) || (x < 0) )
			return Double.NaN;
		if (n <= 0)
			return 0;
		if (n == 1)
			return x;
		double h = 1;
		for (double k = 2.0; k <= n; k++) {
			h += 1 / power(k, x);
			if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		}
		return h;
	}
	/**
	 * Harmonic number 1/1 + 1/2^x + ... + 1/n^x
	 *
	 * @param      x                   the x function parameter
	 * @param      n                   the n function parameter
	 *
	 * @return     if x,n &lt;&gt; Double.NaN returns harmonicNumber( x, (int)Math.round(n) ),
	 *             otherwise returns Double.NaN.
	 */
	public static double harmonicNumber(double x, double n) {
		if ( (Double.isNaN(x)) || (Double.isNaN(n)) )
			return Double.NaN;
		return harmonicNumber( x, (int)Math.round(n) );
	}
	/**
	 * Catalan numbers
	 *
	 * @param      n                   the n function parameter
	 *
	 * @return     Catalan numbers
	 */
	public static double catalanNumber(int n) {
		return binomCoeff(2*n, n) * div(1, n+1);
	}
	/**
	 * Catalan numbers
	 *
	 * @param      n                   the n function parameter
	 *
	 * @return     if n &lt;&gt; Double.NaN returns catalanNumber( (int)Math.round(n) ),
	 *             otherwise returns Double.NaN.
	 */
	public static double catalanNumber(double n) {
		if (Double.isNaN(n))
			return Double.NaN;
		return catalanNumber( (int)Math.round(n) );
	}
	/**
	 * Fibonacci numbers
	 *
	 * @param      n                   the n function parameter
	 *
	 * @return     if n &gt;= 0 returns fibonacci numbers,
	 *             otherwise returns Double.NaN.
	 *             Returns also Double.NaN when MAX RECURSION CALLS
	 *             is exceeded.
	 *
	 * @see mXparser#getMaxAllowedRecursionDepth()
	 * @see mXparser#setMaxAllowedRecursionDepth(int)
	 */
	public static double fibonacciNumber(int n) {
		refreshMaxAllowedRecursionDepth();
		return fibonacciNumber(n, 1);
	}
	private static double fibonacciNumber(int n, int recursionCall) {
		if (recursionCall > MAX_RECURSION_CALLS)
			return Double.NaN;
		if (n < 0)
			return Double.NaN;
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		double f1 = fibonacciNumber(n - 1, recursionCall + 1);
		if (Double.isNaN(f1))
			return Double.NaN;
		double f2 = fibonacciNumber(n - 2, recursionCall + 1);
		if (Double.isNaN(f2))
			return Double.NaN;
		return f1 + f2;
	}
	/**
	 * Fibonacci numbers
	 *
	 * @param      n                   the n function parameter
	 *
	 * @return     if n &lt;&gt; Double.NaN returns fibonacciNumber( (int)Math.round(n) ),
	 *             otherwise returns Double.NaN.
	 */
	public static double fibonacciNumber(double n) {
		if (Double.isNaN(n))
			return Double.NaN;
		return fibonacciNumber( (int)Math.round(n) );
	}
	/**
	 * Lucas numebrs
	 *
	 * @param      n                   the n function parameter
	 *
	 * @return     if n &gt;= 0 returns Lucas numbers,
	 *             otherwise returns Double.NaN.
	 *             Returns also Double.NaN when MAX RECURSION CALLS
	 *             is exceeded.
	 *
	 * @see mXparser#getMaxAllowedRecursionDepth()
	 * @see mXparser#setMaxAllowedRecursionDepth(int)
	 */
	public static double lucasNumber(int n) {
		refreshMaxAllowedRecursionDepth();
		return lucasNumber(n, 1);
	}
	private static double lucasNumber(int n, int recursionCall) {
		if (recursionCall > MAX_RECURSION_CALLS)
			return Double.NaN;
		if (n < 0)
			return Double.NaN;
		if (n == 0)
			return 2;
		if (n == 1)
			return 1;
		if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		double l1 = lucasNumber(n - 1, recursionCall + 1);
		if (Double.isNaN(l1))
			return Double.NaN;
		double l2 = lucasNumber(n - 2, recursionCall + 1);
		if (Double.isNaN(l2))
			return Double.NaN;
		return l1 + l2;
	}
	/**
	 * Lucas numebrs
	 *
	 * @param      n                   the n function parameter
	 *
	 * @return     if n &lt;&gt; Double.NaN returns lucasNumber( (int)Math.round(n) ),
	 *             otherwise returns Double.NaN.
	 */
	public static double lucasNumber(double n) {
		if (Double.isNaN(n))
			return Double.NaN;
		return lucasNumber( (int)Math.round(n) );
	}
	/**
	 * Kronecker delta
	 *
	 * @param      i                   the i function parameter
	 * @param      j                   the j function parameter
	 *
	 * @return     if i,j &lt;&gt; Double.NaN returns Kronecker delta,
	 *             otherwise returns Double.NaN.
	 */
	public static double kroneckerDelta(double i, double j) {
		if (Double.isNaN(i) || Double.isNaN(j))
			return Double.NaN;
		if (i == j)
			return 1;
		else
			return 0;
	}
	/**
	 * Kronecker delta
	 *
	 * @param      i                   the i function parameter
	 * @param      j                   the j function parameter
	 *
	 * @return     Kronecker delta
	 */
	public static double kroneckerDelta(int i, int j) {
		if (i == j)
			return 1;
		else
			return 0;
	}
	/**
	 * Continued fraction
	 *
	 * @param      sequence            the numbers
	 *
	 * @return     if each number form the sequence &lt;&gt; Double.NaN and
	 *             there is no division by 0 while computing returns continued fraction
	 *             value, otherwise returns Double.NaN.
	 */
	public static double continuedFraction(double... sequence) {
		if (sequence == null) return Double.NaN;
		if (sequence.length == 0) return Double.NaN;
		double cf = 0;
		double a;
		if (sequence.length == 1)
			return sequence[0];
		int lastIndex = sequence.length-1;
		for(int i = lastIndex; i >= 0; i--) {
			a = sequence[i];
			if (Double.isNaN(a))
				return Double.NaN;
			if (i == lastIndex) {
				cf = a;
			} else {
				if (cf == 0)
					return Double.NaN;
				cf = a + 1.0 / cf;
			}
			if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		}
		return cf;
	}
	/**
	 * Private function calculating continued polynomial
	 * recursively.
	 *
	 * @param      n         the polynomial order
	 * @param      x         the x values
	 *
	 * @return     continued polynomial value
	 */
	private static double continuedPolynomial(int n, double[] x) {
		if (x == null) return Double.NaN;
		if (x.length == 0) return Double.NaN;
		if (n == 0)
			return 1;
		if (n == 1)
			return x[0];
		if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		return x[n-1] * continuedPolynomial(n-1, x) + continuedPolynomial(n-2, x);
	}
	/**
	 * Continued polynomial
	 *
	 * @param      x         the x values
	 *
	 * @return     if each number for x is different the Double.NaN
	 *             returns continued polynomial, otherwise returns
	 *             Double.NaN.
	 */
	public static double continuedPolynomial(double... x) {
		if (x == null) return Double.NaN;
		if (x.length == 0) return Double.NaN;
		for (double d : x) {
			if (Double.isNaN(d))
				return Double.NaN;
			if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		}
		return continuedPolynomial(x.length, x);
	}
	/**
	 * Euler polynomial
	 *
	 * @param      m                   the m parameter
	 * @param      x                   the x parameter
	 *
	 * @return     if x &lt;&gt; Double.NaN and m &gt;= 0 returns polynomial value,
	 *             otherwise returns Double.NaN.
	 */
	public static double eulerPolynomial(int m, double x) {
		if (Double.isNaN(x))
			return Double.NaN;
		double result = Double.NaN;
		if (m >= 0) {
			result = 0;
			for (int n = 0; n <= m; n++) {
				for (int k = 0; k <= n; k++) {
					result += Math.pow(-1, k) * binomCoeff(n, k) * Math.pow(x+k, m);
					if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
				}
				result /= Math.pow(2, n);
			}
		}
		return result;
	}
	/**
	 * Euler polynomial
	 *
	 * @param      m                   the m parameter
	 * @param      x                   the x parameter
	 *
	 * @return     if x,m &lt;&gt; Double.NaN returns eulerPolynomial( (int)Math.round(m), (int)Math.round(x) ),
	 *             otherwise returns Double.NaN.
	 */
	public static double eulerPolynomial(double m, double x) {
		if (Double.isNaN(m) || Double.isNaN(x))
			return Double.NaN;
		return eulerPolynomial( (int)Math.round(m), (int)Math.round(x) );
	}
	/**
	 * Characteristic function x in (a,b)
	 *
	 * @param      x                   the x value
	 * @param      a                   the left (lower) limit
	 * @param      b                   the right (upper) limit
	 *
	 * @return     if x, a, b &lt;&gt; Double.NaN returns
	 * 			   characteristic function value on the (a,b) range.
	 */
	public static double chi(double x, double a, double b) {
		if (Double.isNaN(x) || Double.isNaN(a) || Double.isNaN(b))
			return Double.NaN;
		double result = Double.NaN;
		if ( (!Double.isNaN(x)) && (!Double.isNaN(a)) && (!Double.isNaN(b)) )
			if ( (x > a) && (x < b) )
				result = 1;
			else
				result = 0;
		return result;
	}
	/**
	 * Characteristic function x in [a,b]
	 *
	 * @param      x                   the x value
	 * @param      a                   the left (lower) limit
	 * @param      b                   the right (upper) limit
	 *
	 * @return     if x, a, b &lt;&gt; Double.NaN returns
	 * 			   characteristic function value on the [a,b] range.
	 */
	public static double chi_LR(double x, double a, double b) {
		if (Double.isNaN(x) || Double.isNaN(a) || Double.isNaN(b))
			return Double.NaN;
		double result = Double.NaN;
		if ( (!Double.isNaN(x)) && (!Double.isNaN(a)) && (!Double.isNaN(b)) )
			if ( (x >= a) && (x <= b) )
				result = 1;
			else
				result = 0;
		return result;
	}
	/**
	 * Characteristic function x in [a,b)
	 *
	 * @param      x                   the x value
	 * @param      a                   the left (lower) limit
	 * @param      b                   the right (upper) limit
	 *
	 * @return     if x, a, b &lt;&gt; Double.NaN returns
	 * 			   characteristic function value on the [a,b) range.
	 */
	public static double chi_L(double x, double a, double b) {
		if (Double.isNaN(x) || Double.isNaN(a) || Double.isNaN(b))
			return Double.NaN;
		double result = Double.NaN;
		if ( (!Double.isNaN(x)) && (!Double.isNaN(a)) && (!Double.isNaN(b)) )
			if ( (x >= a) && (x < b) )
				result = 1;
			else
				result = 0;
		return result;
	}
	/**
	 * Characteristic function x in (a,b]
	 *
	 * @param      x                   the x value
	 * @param      a                   the left (lower) limit
	 * @param      b                   the right (upper) limit
	 *
	 * @return     if x, a, b &lt;&gt; Double.NaN returns
	 * 			   characteristic function value on the (a,b] range.
	 */
	public static double chi_R(double x, double a, double b) {
		if (Double.isNaN(x) || Double.isNaN(a) || Double.isNaN(b))
			return Double.NaN;
		double result = Double.NaN;
		if ( (!Double.isNaN(x)) && (!Double.isNaN(a)) && (!Double.isNaN(b)) )
			if ( (x > a) && (x <= b) )
				result = 1;
			else
				result = 0;
		return result;
	}
	/**
	 * Verifies whether provided number is almost integer
	 *
	 * @see BinaryRelations#DEFAULT_COMPARISON_EPSILON
	 *
	 * @param a  The number to be verified
	 * @return   True if the number is almost integer according to the default epsilon,
	 *           otherwise returns false.
	 */
	public static boolean isAlmostInt(double a) {
		double aint = Math.round(a);
		if (abs(a - aint) <= BinaryRelations.DEFAULT_COMPARISON_EPSILON) return true;
		else return false;
	}
	/**
	 * Applies the integer exponent to the base a
	 *
	 * @param a   The base
	 * @param n   The integer exponent
	 * @return    Return a to the power of n, if canonical rounding is enable, the it operates on big numbers
	 */
	private static double powInt(double a, int n) {
		if (Double.isNaN(a)) return Double.NaN;
		if (Double.isInfinite(a)) return Math.pow(a, n);
		if (a == 0) return Math.pow(a, n);
		if (n == 0) return 1;
		if (n == 1) return a;
		if (mXparser.checkIfCanonicalRounding()) {
			BigDecimal da = BigDecimal.valueOf(a);
			try {
				if (n >= 0) return da.pow(n).doubleValue();
				else return BigDecimal.ONE.divide(da, MathContext.DECIMAL128).pow(-n).doubleValue();
			} catch (Throwable e) {
				return Math.pow(a, n);
			}
		} else {
			return Math.pow(a, n);
		}
	}
	/**
	 * Power function a^b
	 *
	 * @param      a                   the a function parameter
	 * @param      b                   the b function parameter
	 *
	 * @return     if a,b &lt;&gt; Double.NaN returns Math.pow(a, b),
	 *             otherwise returns Double.NaN.
	 */
	public static double power(double a, double b) {
		if (Double.isNaN(a) || Double.isNaN(b))
			return Double.NaN;
		if (Double.isInfinite(a)) Math.pow(a, b);
		if (Double.isInfinite(b)) Math.pow(a, b);
		double babs = Math.abs(b);
		double bint = Math.round(babs);
		if ( MathFunctions.abs(babs - bint) <= BinaryRelations.DEFAULT_COMPARISON_EPSILON
				&& babs < Integer.MAX_VALUE && -babs > Integer.MIN_VALUE) {
			if (b >= 0) return powInt(a, (int)bint);
			else return powInt(a, -(int)bint);
		} else if (a >= 0)
			return Math.pow(a, b);
		else if (abs(b) >= 1)
			return Math.pow(a, b);
		else if (b == 0)
			return Math.pow(a, b);
		else {
			double ndob = 1.0 / abs(b);
			double nint = Math.round(ndob);
			if ( MathFunctions.abs(ndob-nint) <= BinaryRelations.DEFAULT_COMPARISON_EPSILON ) {
				long n = (long)nint;
				if (n % 2 == 1)
					if (b > 0)
						return -Math.pow( abs(a), 1.0 / ndob);
					else
						return -Math.pow( abs(a), -1.0 / ndob);
				else
					return Double.NaN;
			} else return Double.NaN;
		}
	}
	/**
	 * Nth order root of a number
	 *
	 * @param n   Root order
	 * @param x   Number
	 * @return    Returns root of a number. If calculation is not possible Double.NaN is returned.
	 */
	public static double root(double n, double x) {
		if (Double.isNaN(n) || Double.isNaN(n)) return Double.NaN;
		if (Double.isInfinite(n) || Double.isInfinite(n)) return Double.NaN;
		if (n < -BinaryRelations.DEFAULT_COMPARISON_EPSILON) return Double.NaN;
		if (abs(n) <= BinaryRelations.DEFAULT_COMPARISON_EPSILON) {
			if (abs(x) <= BinaryRelations.DEFAULT_COMPARISON_EPSILON) return 0;
			else if (abs(x-1) <= BinaryRelations.DEFAULT_COMPARISON_EPSILON) return 1;
			else return Double.NaN;
		}
		long nint = (long)floor(n);
		if (nint == 1) return x;
		if (nint == 2) return sqrt(x);
		if (nint % 2 == 1) {
			if ( x >= 0) return Math.pow(x, 1.0 / nint);
			else return -Math.pow( abs(x), 1.0 / nint);
		} else {
			if ( x >= 0) return Math.pow(x, 1.0 / nint);
			else return Double.NaN;
		}
	}
	/**
	 * Tetration, exponential power, power series
	 *
	 * @param a   base
	 * @param n   exponent
	 * @return    Tetration result.
	 */
	public static double tetration(double a, double n) {
		if (Double.isNaN(a)) return Double.NaN;
		if (Double.isNaN(n)) return Double.NaN;
		if (n == Double.POSITIVE_INFINITY) {
			if (BinaryRelations.isEqualOrAlmost(a, 1)) return 1.0;
			if (abs(a - MathConstants.EXP_MINUS_E) <= BinaryRelations.DEFAULT_COMPARISON_EPSILON)
				return MathConstants.EXP_MINUS_1;
			if (abs(a - MathConstants.EXP_1_OVER_E) <= BinaryRelations.DEFAULT_COMPARISON_EPSILON)
				return MathConstants.E;
			if ((a > MathConstants.EXP_MINUS_E) && (a < MathConstants.EXP_1_OVER_E))
				return SpecialFunctions.lambertW( -MathFunctions.ln(a), 0) / ( -MathFunctions.ln(a) );
			if (a > MathConstants.EXP_1_OVER_E) return Double.POSITIVE_INFINITY;
			if (a < MathConstants.EXP_MINUS_E) return Double.NaN;
		}
		if (n < -BinaryRelations.DEFAULT_COMPARISON_EPSILON) return Double.NaN;
		if (abs(n) <= BinaryRelations.DEFAULT_COMPARISON_EPSILON) {
			if (abs(a) > BinaryRelations.DEFAULT_COMPARISON_EPSILON)
				return 1;
			else
				return Double.NaN;
		}
		n = floor(n);
		if (n == 0) {
			if (abs(a) > BinaryRelations.DEFAULT_COMPARISON_EPSILON)
				return 1;
			else
				return Double.NaN;
		}
		if (abs(a) <= BinaryRelations.DEFAULT_COMPARISON_EPSILON) return 0;
		if (n == 1) return a;
		double r = a;
		for (double i = 2; i <= n; i++) {
			r = Math.pow(a, r);
			if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		}
		return r;
	}
	/**
	 * Modulo operator a % b
	 *
	 * @param      a                   the a function parameter
	 * @param      b                   the b function parameter
	 *
	 * @return     if a,b &lt;&gt; Double.NaN returns a % b.
	 */
	public static double mod(double a, double b) {
		if (Double.isNaN(a) || Double.isNaN(b))
			return Double.NaN;
		return a % b;
	}
	/**
	 * Division a/b
	 *
	 * @param      a                   the a function parameter
	 * @param      b                   the b function parameter
	 *
	 * @return     if a,b &lt;&gt; Double.NaN and b &lt;&gt; 0 returns a/b,
	 *             otherwise return Double.NaN.
	 */
	/*
	public static final double div(double a, double b) {
		if (Double.isNaN(a) || Double.isNaN(b))
			return Double.NaN;
		double result = Double.NaN;
		if (b != 0)
			result = a / b;
		return result;
	}
	*/
	/**
	 * Sine trigonometric function
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN return Math.sin(a),
	 *             otherwise return Double.NaN.
	 */
	public static double sin(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		if (mXparser.checkIfDegreesMode())
			a = a * Units.DEGREE_ARC;
		SpecialValueTrigonometric sv = SpecialValueTrigonometric.getSpecialValueTrigonometric(a);
		if (sv != null)
			return sv.sin;
		return Math.sin(a);
	}
	/**
	 * Cosine trigonometric function
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.cos(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double cos(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		if (mXparser.checkIfDegreesMode())
			a = a * Units.DEGREE_ARC;
		SpecialValueTrigonometric sv = SpecialValueTrigonometric.getSpecialValueTrigonometric(a);
		if (sv != null)
			return sv.cos;
		return Math.cos(a);
	}
	/**
	 * Tangent trigonometric function
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.tan(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double tan(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		if (mXparser.checkIfDegreesMode())
			a = a * Units.DEGREE_ARC;
		SpecialValueTrigonometric sv = SpecialValueTrigonometric.getSpecialValueTrigonometric(a);
		if (sv != null)
			return sv.tan;
		return Math.tan(a);
	}
	/**
	 * Cotangent trigonometric function
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN and tan(a) &lt;&gt; 0 returns 1 / Math.tan(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double ctan(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		if (mXparser.checkIfDegreesMode())
			a = a * Units.DEGREE_ARC;
		SpecialValueTrigonometric sv = SpecialValueTrigonometric.getSpecialValueTrigonometric(a);
		if (sv != null)
			return sv.ctan;
		double result = Double.NaN;
		double tg = Math.tan(a);
		if (tg != 0)
			result = 1.0 / tg;
		return result;
	}
	/**
	 * Secant trigonometric function
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN and cos(a) &lt;&gt; 0 returns 1 / Math.cos(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double sec(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		if (mXparser.checkIfDegreesMode())
			a = a * Units.DEGREE_ARC;
		SpecialValueTrigonometric sv = SpecialValueTrigonometric.getSpecialValueTrigonometric(a);
		if (sv != null)
			return sv.sec;
		double result = Double.NaN;
		double cos = Math.cos(a);
		if (cos != 0)
			result = 1.0 / cos;
		return result;
	}
	/**
	 * Cosecant trigonometric function
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN and sin(a) &lt;&gt; 0 returns 1 / Math.sin(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double cosec(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		if (mXparser.checkIfDegreesMode())
			a = a * Units.DEGREE_ARC;
		SpecialValueTrigonometric sv = SpecialValueTrigonometric.getSpecialValueTrigonometric(a);
		if (sv != null)
			return sv.csc;
		double result = Double.NaN;
		double sin = Math.sin(a);
		if (sin != 0)
			result = 1.0 / sin;
		return result;
	}
	/**
	 * If double is almost integer returns the closes integer, otherwise original value
	 * @param val   Parameter
	 * @return      f double is almost integer returns the closest integer, otherwise original value
	 */
	private static double intIfAlmostIntOtherwiseOrig(double val) {
		double valint = Math.round(val);
		if ( Math.abs(val-valint) <= BinaryRelations.DEFAULT_COMPARISON_EPSILON ) return valint;
		return val;
	}
	/**
	 * Arcus sine - inverse trigonometric sine function
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.asin(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double asin(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		SpecialValue sv = SpecialValueTrigonometric.getSpecialValueAsin(a);
		double r;
		if (sv != null) r = sv.fv;
		else r = Math.asin(a);
		if (mXparser.checkIfDegreesMode()) {
			if (sv != null) return sv.fvdeg;
			return intIfAlmostIntOtherwiseOrig(div(r, Units.DEGREE_ARC));
		} else return r;
	}
	/**
	 * Arcus cosine - inverse trigonometric cosine function
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.acos(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double acos(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		SpecialValue sv = SpecialValueTrigonometric.getSpecialValueAcos(a);
		double r;
		if (sv != null) r = sv.fv;
		else r = Math.acos(a);
		if (mXparser.checkIfDegreesMode()) {
			if (sv != null) return sv.fvdeg;
			return intIfAlmostIntOtherwiseOrig(div(r, Units.DEGREE_ARC));
		} else return r;
	}
	/**
	 * Arcus tangent - inverse trigonometric tangent function
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.atan(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double atan(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		SpecialValue sv = SpecialValueTrigonometric.getSpecialValueAtan(a);
		double r;
		if (sv != null) r = sv.fv;
		else r = Math.atan(a);
		if (mXparser.checkIfDegreesMode()) {
			if (sv != null) return sv.fvdeg;
			return intIfAlmostIntOtherwiseOrig(div(r, Units.DEGREE_ARC));
		}
		else return r;
	}
	/**
	 * Arcus cotangent - inverse trigonometric cotangent function
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN and a &lt;&gt; 0 returns Math.atan(1/a),
	 *             otherwise returns Double.NaN.
	 */
	public static double actan(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		SpecialValue sv = SpecialValueTrigonometric.getSpecialValueActan(a);
		double r;
		if (sv != null) r = sv.fv;
		else {
			if (a > 0) r = Math.atan(1/a);
			else if (a < 0) r = Math.atan(1/a) + MathConstants.PI;
			else r = Double.NaN;
		}
		if (mXparser.checkIfDegreesMode()) {
			if (sv != null) return sv.fvdeg;
			return intIfAlmostIntOtherwiseOrig(div(r, Units.DEGREE_ARC));
		}
		else return r;
	}
	/**
	 * Arcus secant - inverse trigonometric secant function
	 *
	 * @param      a                   the a function parameter
	 * @return     Inverse trigonometric secant function
	 */
	public static double asec(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		SpecialValue sv = SpecialValueTrigonometric.getSpecialValueAsec(a);
		double r;
		if (sv != null) r = sv.fv;
		else r = Math.acos(1/a);
		if (mXparser.checkIfDegreesMode()) {
			if (sv != null) return sv.fvdeg;
			return intIfAlmostIntOtherwiseOrig(div(r, Units.DEGREE_ARC));
		}
		else return r;
	}
	/**
	 * Arcus cosecant - inverse trigonometric cosecant function
	 *
	 * @param      a                   the a function parameter
	 * @return     Inverse trigonometric cosecant function
	 */
	public static double acosec(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		SpecialValue sv = SpecialValueTrigonometric.getSpecialValueAcsc(a);
		double r;
		if (sv != null) r = sv.fv;
		else r = Math.asin(1/a);
		if (mXparser.checkIfDegreesMode()) {
			if (sv != null) return sv.fvdeg;
			return intIfAlmostIntOtherwiseOrig(div(r, Units.DEGREE_ARC));
		}
		else return r;
	}
	/**
	 * Natural logarithm
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.log(1/a),
	 *             otherwise returns Double.NaN.
	 */
	public static double ln(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.log(a);
	}
	/**
	 * Binary logarithm
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.log(a)/Math.log(2.0),
	 *             otherwise returns Double.NaN.
	 */
	public static double log2(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.log(a)/Math.log(2.0);
	}
	/**
	 * Common logarithm
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.log10(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double log10(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.log10(a);
	}
	/**
	 * Degrees to radius translation.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.toRadians(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double rad(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.toRadians(a);
	}
	/**
	 * Exponential function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.exp(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double exp(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.exp(a);
	}
	/**
	 * Square root.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.sqrt(a),
	 *             otherwise returns Double.NaN.
	 */
	 public static double sqrt(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.sqrt(a);
	}
	/**
	 * Hyperbolic sine function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.sinh(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double sinh(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.sinh(a);
	}
	/**
	 * Hyperbolic cosine function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.cosh(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double cosh(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.cosh(a);
	}
	/**
	 * Hyperbolic tangent function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.tanh(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double tanh(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.tanh(a);
	}
	/**
	 * Hyperbolic cotangent function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN and tanh(a) &lt;&gt; 0 returns 1 / Math.tanh(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double coth(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		double result = Double.NaN;
		double tanh = Math.tanh(a);
		if (tanh != 0)
			result = 1.0 / tanh;
		return result;
	}
	/**
	 * Hyperbolic secant function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN and cosh(a) &lt;&gt; 0 returns 1 / Math.cosh(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double sech(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		double result = Double.NaN;
		double cosh = Math.cosh(a);
		if (cosh != 0)
			result = 1.0 / cosh;
		return result;
	}
	/**
	 * Hyperbolic cosecant function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN and sinh(a) &lt;&gt; 0 returns 1 / Math.sinh(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double csch(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		double result = Double.NaN;
		double sinh = Math.sinh(a);
		if (sinh != 0)
			result = 1.0 / sinh;
		return result;
	}
	/**
	 * Radius to degrees translation.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.toDegrees(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double deg(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.toDegrees(a);
	}
	/**
	 * Absolute value.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.abs(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double abs(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.abs(a);
	}
	/**
	 * Signum function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.signum(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double sgn(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.signum(a);
	}
	/**
	 * Floor function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.floor(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double floor(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.floor(a);
	}
	/**
	 * Ceiling function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.ceil(a),
	 *             otherwise returns Double.NaN.
	 */
	public static double ceil(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.ceil(a);
	}
	/**
	 * Arcus hyperbolic sine - inverse hyperbolic sine function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.log(a + Math.sqrt(a*a+1)),
	 *             otherwise returns Double.NaN.
	 */
	public static double arsinh(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.log(a + Math.sqrt(a*a+1));
	}
	/**
	 * Arcus hyperbolic cosine - inverse hyperbolic cosine function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN returns Math.log(a + Math.sqrt(a*a-1)),
	 *             otherwise returns Double.NaN.
	 */
	public static double arcosh(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		return Math.log(a + Math.sqrt(a*a-1));
	}
	/**
	 * Arcus hyperbolic tangent - inverse hyperbolic tangent function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN and 1-a &lt;&gt; 0 returns 0.5*Math.log( (1+a)/(1-a) ),
	 *             otherwise returns Double.NaN.
	 */
	public static double artanh(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		double result = Double.NaN;
		if (1-a != 0)
			result = 0.5*Math.log( (1+a)/(1-a) );
		return result;
	}
	/**
	 * Arcus hyperbolic tangent - inverse hyperbolic tangent function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN and a-1 &lt;&gt; 0 returns 0.5*Math.log( (a+1)/(a-1) );,
	 *             otherwise returns Double.NaN.
	 */
	public static double arcoth(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		double result = Double.NaN;
		if (a-1 != 0)
			result = 0.5*Math.log( (a+1)/(a-1) );
		return result;
	}
	/**
	 * Arcus hyperbolic secant - inverse hyperbolic secant function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN and a &lt;&gt; 0 returns Math.log( (1+Math.sqrt(1-a*a))/a);,
	 *             otherwise returns Double.NaN.
	 */
	public static double arsech(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		double result = Double.NaN;
		if (a != 0)
			result = Math.log( (1+Math.sqrt(1-a*a))/a);
		return result;
	}
	/**
	 * Arcus hyperbolic cosecant - inverse hyperbolic cosecant function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN and a &lt;&gt; 0 returns Math.log( (1+Math.sqrt(1-a*a))/a);,
	 *             otherwise returns Double.NaN.
	 */
	public static double arcsch(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		double result = Double.NaN;
		if (a != 0)
			result = Math.log( 1/a + Math.sqrt(1+a*a)/Math.abs(a) );
		return result;
	}
	/**
	 * Normalized sinc function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN and a &lt;&gt; 0 returns Math.sin(PI*a) / (PI*a);,
	 *             otherwise returns Double.NaN.
	 */
	public static double sa(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		double x = MathConstants.PI * a;
		double result = Double.NaN;
		if (x != 0)
			result = Math.sin(x) / (x);
		else
			result =  1.0;
		return result;
	}
	/**
	 * Sinc function.
	 *
	 * @param      a                   the a function parameter
	 *
	 * @return     if a &lt;&gt; Double.NaN and a &lt;&gt; 0 returns Math.sin(a) / (a),
	 *             otherwise returns Double.NaN.
	 */
	public static double sinc(double a) {
		if (Double.isNaN(a))
			return Double.NaN;
		double result = Double.NaN;
		if (a != 0)
			if (mXparser.checkIfDegreesMode())
				result = Math.sin(a * Units.DEGREE_ARC) / (a);
			else
				result = Math.sin(a) / (a);
		else
			result =  1.0;
		return result;
	}
	/**
	 * General logarithm.
	 *
	 * @param      a                   the a function parameter (base)
	 * @param      b                   the b function parameter (number)
	 *
	 * @return     if a,b &lt;&gt; Double.NaN and log(b) &lt;&gt; 0 returns Math.log(a) / Math.log(b),
	 *             otherwise returns Double.NaN.
	 */
	public static double log(double a, double b) {
		if (Double.isNaN(a) || Double.isNaN(b))
			return Double.NaN;
		double result = Double.NaN;
		double logb = Math.log(b);
		if (logb != 0)
			result = Math.log(a) / logb;
		return result;
	}
	/**
	 * Double rounding
	 *
	 * @param value    double value to be rounded
	 * @param places   decimal places
	 * @return         Rounded value
	 */
 	public static double round(double value, int places) {
		if (Double.isNaN(value)) return Double.NaN;
		if (Double.isInfinite(value)) return value;
		if (places < 0) return Double.NaN;
		try {
			BigDecimal bd = new BigDecimal(Double.toString(value));
			bd = bd.setScale(places, RoundingMode.HALF_UP);
			return bd.doubleValue();
		} catch (Throwable e) {
			return roundHalfUp(value, places);
		}
 	}
	/**
	 * Double half up rounding
	 *
	 * @param value    double value to be rounded
	 * @param places   decimal places
	 * @return         Rounded value
	 */
 	public static double roundHalfUp(double value, int places) {
 		if (Double.isNaN(value)) return Double.NaN;
		if (places < 0) return Double.NaN;
 		if (value == Double.NEGATIVE_INFINITY) return Double.NEGATIVE_INFINITY;
 		if (value == Double.POSITIVE_INFINITY) return Double.POSITIVE_INFINITY;
 		if (value == 0) return 0;
 		double sign = 1;
 		double origValue = value;
 		if (value < 0) {
 			sign = -1;
 			value = -value;
 		}
 		int ulpPosition = MathFunctions.ulpDecimalDigitsBefore(value);
 		if (ulpPosition <= 0) return sign * Math.floor(value);
 		if (places > ulpPosition) return origValue;
 		double multiplier = 1;
 		for (int place = 0; place < places; place++) {
 			multiplier = Math.floor(multiplier * 10);
 			if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
 		}
 		double valueMultiplied = value * multiplier;
 		double valueFloor = Math.floor(valueMultiplied);
 		if (Math.abs(valueMultiplied - valueFloor) >= 0.5) valueFloor = Math.floor(valueFloor + 1);
 		return Math.floor(sign * valueFloor) / multiplier;
 	}
	/**
	 * Double down rounding
	 *
	 * @param value    double value to be rounded
	 * @param places   decimal places
	 * @return         Rounded value
	 */
 	public static double roundDown(double value, int places) {
 		if (Double.isNaN(value)) return Double.NaN;
		if (places < 0) return Double.NaN;
 		if (value == Double.NEGATIVE_INFINITY) return Double.NEGATIVE_INFINITY;
 		if (value == Double.POSITIVE_INFINITY) return Double.POSITIVE_INFINITY;
 		if (value == 0) return 0;
 		double sign = 1;
 		double origValue = value;
 		if (value < 0) {
 			sign = -1;
 			value = -value;
 		}
 		int ulpPosition = MathFunctions.ulpDecimalDigitsBefore(value);
 		if (ulpPosition <= 0) return sign * Math.floor(value);
 		if (places > ulpPosition) return origValue;
 		double multiplier = 1;
 		for (int place = 0; place < places; place++) {
 			multiplier = Math.floor(multiplier * 10);
 			if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
 		}
 		double valueMultiplied = value * multiplier;
 		double valueFloor = Math.floor(valueMultiplied);
 		return Math.floor(sign * valueFloor) / multiplier;
 	}
 	/**
 	 * Unit in the last place rounding, see
 	 * 0.1 + 0.1 + 0.1 vs roundUlp(0.1 + 0.1 + 0.1)
 	 *
 	 * @param number   Double number that is to be rounded
 	 *
 	 * @return    Double number with rounded ulp
 	 *
 	 * @see MathFunctions#decimalDigitsBefore(double)
 	 * @see MathFunctions#ulp(double)
 	 */
	public static double roundUlp(double number) {
		if ( (Double.isNaN(number) ) || (Double.isInfinite(number)) || (number == 0) )
			return number;
		else {
			int precision = MathFunctions.ulpDecimalDigitsBefore(number);
			if (precision >= 1)
				return MathFunctions.round(number, precision-5);
			else if (precision == 0)
				return MathFunctions.round(number, 0);
			else return number;
		}
	}
 	/**
 	 * Returns integer part of a double value.
 	 * @param x  Number
 	 * @return For non-negative x returns Math.floor(x),
 	 *         otherwise returns -Math.floor(-x)
 	 */
 	public static double integerPart(double x) {
 		if (x > 0) return Math.floor(x);
 		else if (x < 0) return -Math.floor(-x);
 		else return 0;
 	}
 	/**
 	 * For very small number returns the position of
 	 * first significant digit, ie 0.1 = 1, 0.01 = 2
 	 *
 	 * @param value Double value, small one.
 	 * @return Number of digits, number of places.
 	 */
	public static int decimalDigitsBefore(double value) {
		if (value == 0) return -1;
		if (value <= 1e-322) return 322;
		else if (value <= 1e-321) return 321;
		else if (value <= 1e-320) return 320;
		else if (value <= 1e-319) return 319;
		else if (value <= 1e-318) return 318;
		else if (value <= 1e-317) return 317;
		else if (value <= 1e-316) return 316;
		else if (value <= 1e-315) return 315;
		else if (value <= 1e-314) return 314;
		else if (value <= 1e-313) return 313;
		else if (value <= 1e-312) return 312;
		else if (value <= 1e-311) return 311;
		else if (value <= 1e-310) return 310;
		else if (value <= 1e-309) return 309;
		else if (value <= 1e-308) return 308;
		else if (value <= 1e-307) return 307;
		else if (value <= 1e-306) return 306;
		else if (value <= 1e-305) return 305;
		else if (value <= 1e-304) return 304;
		else if (value <= 1e-303) return 303;
		else if (value <= 1e-302) return 302;
		else if (value <= 1e-301) return 301;
		else if (value <= 1e-300) return 300;
		else if (value <= 1e-299) return 299;
		else if (value <= 1e-298) return 298;
		else if (value <= 1e-297) return 297;
		else if (value <= 1e-296) return 296;
		else if (value <= 1e-295) return 295;
		else if (value <= 1e-294) return 294;
		else if (value <= 1e-293) return 293;
		else if (value <= 1e-292) return 292;
		else if (value <= 1e-291) return 291;
		else if (value <= 1e-290) return 290;
		else if (value <= 1e-289) return 289;
		else if (value <= 1e-288) return 288;
		else if (value <= 1e-287) return 287;
		else if (value <= 1e-286) return 286;
		else if (value <= 1e-285) return 285;
		else if (value <= 1e-284) return 284;
		else if (value <= 1e-283) return 283;
		else if (value <= 1e-282) return 282;
		else if (value <= 1e-281) return 281;
		else if (value <= 1e-280) return 280;
		else if (value <= 1e-279) return 279;
		else if (value <= 1e-278) return 278;
		else if (value <= 1e-277) return 277;
		else if (value <= 1e-276) return 276;
		else if (value <= 1e-275) return 275;
		else if (value <= 1e-274) return 274;
		else if (value <= 1e-273) return 273;
		else if (value <= 1e-272) return 272;
		else if (value <= 1e-271) return 271;
		else if (value <= 1e-270) return 270;
		else if (value <= 1e-269) return 269;
		else if (value <= 1e-268) return 268;
		else if (value <= 1e-267) return 267;
		else if (value <= 1e-266) return 266;
		else if (value <= 1e-265) return 265;
		else if (value <= 1e-264) return 264;
		else if (value <= 1e-263) return 263;
		else if (value <= 1e-262) return 262;
		else if (value <= 1e-261) return 261;
		else if (value <= 1e-260) return 260;
		else if (value <= 1e-259) return 259;
		else if (value <= 1e-258) return 258;
		else if (value <= 1e-257) return 257;
		else if (value <= 1e-256) return 256;
		else if (value <= 1e-255) return 255;
		else if (value <= 1e-254) return 254;
		else if (value <= 1e-253) return 253;
		else if (value <= 1e-252) return 252;
		else if (value <= 1e-251) return 251;
		else if (value <= 1e-250) return 250;
		else if (value <= 1e-249) return 249;
		else if (value <= 1e-248) return 248;
		else if (value <= 1e-247) return 247;
		else if (value <= 1e-246) return 246;
		else if (value <= 1e-245) return 245;
		else if (value <= 1e-244) return 244;
		else if (value <= 1e-243) return 243;
		else if (value <= 1e-242) return 242;
		else if (value <= 1e-241) return 241;
		else if (value <= 1e-240) return 240;
		else if (value <= 1e-239) return 239;
		else if (value <= 1e-238) return 238;
		else if (value <= 1e-237) return 237;
		else if (value <= 1e-236) return 236;
		else if (value <= 1e-235) return 235;
		else if (value <= 1e-234) return 234;
		else if (value <= 1e-233) return 233;
		else if (value <= 1e-232) return 232;
		else if (value <= 1e-231) return 231;
		else if (value <= 1e-230) return 230;
		else if (value <= 1e-229) return 229;
		else if (value <= 1e-228) return 228;
		else if (value <= 1e-227) return 227;
		else if (value <= 1e-226) return 226;
		else if (value <= 1e-225) return 225;
		else if (value <= 1e-224) return 224;
		else if (value <= 1e-223) return 223;
		else if (value <= 1e-222) return 222;
		else if (value <= 1e-221) return 221;
		else if (value <= 1e-220) return 220;
		else if (value <= 1e-219) return 219;
		else if (value <= 1e-218) return 218;
		else if (value <= 1e-217) return 217;
		else if (value <= 1e-216) return 216;
		else if (value <= 1e-215) return 215;
		else if (value <= 1e-214) return 214;
		else if (value <= 1e-213) return 213;
		else if (value <= 1e-212) return 212;
		else if (value <= 1e-211) return 211;
		else if (value <= 1e-210) return 210;
		else if (value <= 1e-209) return 209;
		else if (value <= 1e-208) return 208;
		else if (value <= 1e-207) return 207;
		else if (value <= 1e-206) return 206;
		else if (value <= 1e-205) return 205;
		else if (value <= 1e-204) return 204;
		else if (value <= 1e-203) return 203;
		else if (value <= 1e-202) return 202;
		else if (value <= 1e-201) return 201;
		else if (value <= 1e-200) return 200;
		else if (value <= 1e-199) return 199;
		else if (value <= 1e-198) return 198;
		else if (value <= 1e-197) return 197;
		else if (value <= 1e-196) return 196;
		else if (value <= 1e-195) return 195;
		else if (value <= 1e-194) return 194;
		else if (value <= 1e-193) return 193;
		else if (value <= 1e-192) return 192;
		else if (value <= 1e-191) return 191;
		else if (value <= 1e-190) return 190;
		else if (value <= 1e-189) return 189;
		else if (value <= 1e-188) return 188;
		else if (value <= 1e-187) return 187;
		else if (value <= 1e-186) return 186;
		else if (value <= 1e-185) return 185;
		else if (value <= 1e-184) return 184;
		else if (value <= 1e-183) return 183;
		else if (value <= 1e-182) return 182;
		else if (value <= 1e-181) return 181;
		else if (value <= 1e-180) return 180;
		else if (value <= 1e-179) return 179;
		else if (value <= 1e-178) return 178;
		else if (value <= 1e-177) return 177;
		else if (value <= 1e-176) return 176;
		else if (value <= 1e-175) return 175;
		else if (value <= 1e-174) return 174;
		else if (value <= 1e-173) return 173;
		else if (value <= 1e-172) return 172;
		else if (value <= 1e-171) return 171;
		else if (value <= 1e-170) return 170;
		else if (value <= 1e-169) return 169;
		else if (value <= 1e-168) return 168;
		else if (value <= 1e-167) return 167;
		else if (value <= 1e-166) return 166;
		else if (value <= 1e-165) return 165;
		else if (value <= 1e-164) return 164;
		else if (value <= 1e-163) return 163;
		else if (value <= 1e-162) return 162;
		else if (value <= 1e-161) return 161;
		else if (value <= 1e-160) return 160;
		else if (value <= 1e-159) return 159;
		else if (value <= 1e-158) return 158;
		else if (value <= 1e-157) return 157;
		else if (value <= 1e-156) return 156;
		else if (value <= 1e-155) return 155;
		else if (value <= 1e-154) return 154;
		else if (value <= 1e-153) return 153;
		else if (value <= 1e-152) return 152;
		else if (value <= 1e-151) return 151;
		else if (value <= 1e-150) return 150;
		else if (value <= 1e-149) return 149;
		else if (value <= 1e-148) return 148;
		else if (value <= 1e-147) return 147;
		else if (value <= 1e-146) return 146;
		else if (value <= 1e-145) return 145;
		else if (value <= 1e-144) return 144;
		else if (value <= 1e-143) return 143;
		else if (value <= 1e-142) return 142;
		else if (value <= 1e-141) return 141;
		else if (value <= 1e-140) return 140;
		else if (value <= 1e-139) return 139;
		else if (value <= 1e-138) return 138;
		else if (value <= 1e-137) return 137;
		else if (value <= 1e-136) return 136;
		else if (value <= 1e-135) return 135;
		else if (value <= 1e-134) return 134;
		else if (value <= 1e-133) return 133;
		else if (value <= 1e-132) return 132;
		else if (value <= 1e-131) return 131;
		else if (value <= 1e-130) return 130;
		else if (value <= 1e-129) return 129;
		else if (value <= 1e-128) return 128;
		else if (value <= 1e-127) return 127;
		else if (value <= 1e-126) return 126;
		else if (value <= 1e-125) return 125;
		else if (value <= 1e-124) return 124;
		else if (value <= 1e-123) return 123;
		else if (value <= 1e-122) return 122;
		else if (value <= 1e-121) return 121;
		else if (value <= 1e-120) return 120;
		else if (value <= 1e-119) return 119;
		else if (value <= 1e-118) return 118;
		else if (value <= 1e-117) return 117;
		else if (value <= 1e-116) return 116;
		else if (value <= 1e-115) return 115;
		else if (value <= 1e-114) return 114;
		else if (value <= 1e-113) return 113;
		else if (value <= 1e-112) return 112;
		else if (value <= 1e-111) return 111;
		else if (value <= 1e-110) return 110;
		else if (value <= 1e-109) return 109;
		else if (value <= 1e-108) return 108;
		else if (value <= 1e-107) return 107;
		else if (value <= 1e-106) return 106;
		else if (value <= 1e-105) return 105;
		else if (value <= 1e-104) return 104;
		else if (value <= 1e-103) return 103;
		else if (value <= 1e-102) return 102;
		else if (value <= 1e-101) return 101;
		else if (value <= 1e-100) return 100;
		else if (value <= 1e-99) return 99;
		else if (value <= 1e-98) return 98;
		else if (value <= 1e-97) return 97;
		else if (value <= 1e-96) return 96;
		else if (value <= 1e-95) return 95;
		else if (value <= 1e-94) return 94;
		else if (value <= 1e-93) return 93;
		else if (value <= 1e-92) return 92;
		else if (value <= 1e-91) return 91;
		else if (value <= 1e-90) return 90;
		else if (value <= 1e-89) return 89;
		else if (value <= 1e-88) return 88;
		else if (value <= 1e-87) return 87;
		else if (value <= 1e-86) return 86;
		else if (value <= 1e-85) return 85;
		else if (value <= 1e-84) return 84;
		else if (value <= 1e-83) return 83;
		else if (value <= 1e-82) return 82;
		else if (value <= 1e-81) return 81;
		else if (value <= 1e-80) return 80;
		else if (value <= 1e-79) return 79;
		else if (value <= 1e-78) return 78;
		else if (value <= 1e-77) return 77;
		else if (value <= 1e-76) return 76;
		else if (value <= 1e-75) return 75;
		else if (value <= 1e-74) return 74;
		else if (value <= 1e-73) return 73;
		else if (value <= 1e-72) return 72;
		else if (value <= 1e-71) return 71;
		else if (value <= 1e-70) return 70;
		else if (value <= 1e-69) return 69;
		else if (value <= 1e-68) return 68;
		else if (value <= 1e-67) return 67;
		else if (value <= 1e-66) return 66;
		else if (value <= 1e-65) return 65;
		else if (value <= 1e-64) return 64;
		else if (value <= 1e-63) return 63;
		else if (value <= 1e-62) return 62;
		else if (value <= 1e-61) return 61;
		else if (value <= 1e-60) return 60;
		else if (value <= 1e-59) return 59;
		else if (value <= 1e-58) return 58;
		else if (value <= 1e-57) return 57;
		else if (value <= 1e-56) return 56;
		else if (value <= 1e-55) return 55;
		else if (value <= 1e-54) return 54;
		else if (value <= 1e-53) return 53;
		else if (value <= 1e-52) return 52;
		else if (value <= 1e-51) return 51;
		else if (value <= 1e-50) return 50;
		else if (value <= 1e-49) return 49;
		else if (value <= 1e-48) return 48;
		else if (value <= 1e-47) return 47;
		else if (value <= 1e-46) return 46;
		else if (value <= 1e-45) return 45;
		else if (value <= 1e-44) return 44;
		else if (value <= 1e-43) return 43;
		else if (value <= 1e-42) return 42;
		else if (value <= 1e-41) return 41;
		else if (value <= 1e-40) return 40;
		else if (value <= 1e-39) return 39;
		else if (value <= 1e-38) return 38;
		else if (value <= 1e-37) return 37;
		else if (value <= 1e-36) return 36;
		else if (value <= 1e-35) return 35;
		else if (value <= 1e-34) return 34;
		else if (value <= 1e-33) return 33;
		else if (value <= 1e-32) return 32;
		else if (value <= 1e-31) return 31;
		else if (value <= 1e-30) return 30;
		else if (value <= 1e-29) return 29;
		else if (value <= 1e-28) return 28;
		else if (value <= 1e-27) return 27;
		else if (value <= 1e-26) return 26;
		else if (value <= 1e-25) return 25;
		else if (value <= 1e-24) return 24;
		else if (value <= 1e-23) return 23;
		else if (value <= 1e-22) return 22;
		else if (value <= 1e-21) return 21;
		else if (value <= 1e-20) return 20;
		else if (value <= 1e-19) return 19;
		else if (value <= 1e-18) return 18;
		else if (value <= 1e-17) return 17;
		else if (value <= 1e-16) return 16;
		else if (value <= 1e-15) return 15;
		else if (value <= 1e-14) return 14;
		else if (value <= 1e-13) return 13;
		else if (value <= 1e-12) return 12;
		else if (value <= 1e-11) return 11;
		else if (value <= 1e-10) return 10;
		else if (value <= 1e-9) return 9;
		else if (value <= 1e-8) return 8;
		else if (value <= 1e-7) return 7;
		else if (value <= 1e-6) return 6;
		else if (value <= 1e-5) return 5;
		else if (value <= 1e-4) return 4;
		else if (value <= 1e-3) return 3;
		else if (value <= 1e-2) return 2;
		else if (value <= 1e-1) return 1;
		else if (value <= 1e-0) return 0;
		else return -1;
	}
	/**
	 * Unit in the last place(ULP) for double
	 * @param value Double number
	 * @return ULP for a given double.
	 */
	public static double ulp(double value) {
		return Math.ulp(value);
	}
	/**
	 * Unit in The Last Place - number of decimal digits before
	 * @param value   Double number
	 * @return        Positive number of digits N for ulp = 1e-{N+1},
	 *                if ulp is &gt; 1 then -1 is returned.
	 *                Returned proper value is always between -1 and +322.
	 *                If value is NaN then -2 is returned.
	 */
	public static int ulpDecimalDigitsBefore(double value) {
		if (Double.isNaN(value)) return -2;
		double u = ulp(value);
		return decimalDigitsBefore(u);
	}
	/**
	 * Length of a number represented in a standard decimal format
	 * @param value   A given number
	 * @return        Length of a number represented in a standard decimal format
	 *                including decimal separator, excluding leading zeros (integer part),
	 *                excluding trailing zeros (fractional part)
	 */
	public static int decimalNumberLength(double value) {
		return DECIMAL_FORMAT.format(value).length();
	}
	/**
	 * Fractional part length of a number represented in a standard decimal format
	 * @param value   A given number
	 * @return        Fractional part length of a number represented in a standard decimal
	 *                format excluding decimal separator, excluding trailing zeros (fractional part)
	 */
	public static int fractionalPartLength(double value) {
		if (Double.isNaN(value)) return 0;
		if (Double.isInfinite(value)) return 0;
		if (ulpDecimalDigitsBefore(value) <= 0) return 0;
		String valueStr = DECIMAL_FORMAT.format(value);
		int dotPos = valueStr.indexOf('.');
		if (dotPos >= 0) return valueStr.length() - 1 - dotPos;
		return 0;
	}
	/**
	 * Intelligent rounding of a number within the decimal position of the ULP (Unit in the Last Place),
	 * provided that the result is significantly shortened in the standard decimal notation. Examples:
	 * 30.499999999999992 is rounded to 30.5, but 30.499999999999122 will not be rounded. Rounding is
	 * made to the decimal position of the ULP minus 2 on condition that the resulted number is shortened
	 * by at least 9 places.
	 * @param value   A given number
	 * @return        Returns an intelligently rounded number when the decimal position of ULP
	 *                is a minimum of 11 and when rounded to the position of ULP - 2, shortens
	 *                the number by a minimum of 9 places. Otherwise, returns original number.
	 */
	public static double lengthRound(double value) {
		if (Double.isNaN(value)) return value;
		if (Double.isInfinite(value)) return value;
		if (value == 0d || value == -1d || value == 1d || value == -2d || value == 2d || value == -3d || value == 3d) return value;
		if (value == -4d || value == 4d || value == -5d || value == 5d || value == -6d || value == 6d) return value;
		if (value == -7d || value == 7d || value == -8d || value == 8d || value == -9d || value == 9d) return value;
		if (value == -10d || value == 10d || value == -11d || value == 11d || value == -12d || value == 12d) return value;
		if (ulpDecimalDigitsBefore(value) < 6) return value;
		int decPartLen = fractionalPartLength(value);
		if (decPartLen < 11) return value;
		double valueRound = round(value, decPartLen - 2);
		int decPartLenRound = fractionalPartLength(valueRound);
		if (decPartLen - decPartLenRound >= 9) return valueRound;
		return value;
	}
	/**
	 * Returns the first non-NaN value
	 *
	 * @param values   List of values
	 * @return         Returns the first non-NaN value, if list is null
	 *                 then returns Double.NaN, if list contains no elements
	 *                 then returns Double.NaN.
	 */
	public static double coalesce(double[] values) {
		if (values == null) return Double.NaN;
		if (values.length == 0) return Double.NaN;
		for (double v : values) {
			if (!Double.isNaN(v)) return v;
			if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		}
		return Double.NaN;
	}
	/**
	 * Check whether double value is almost integer.
	 * @param x   Number
	 * @return True if double value is almost integer, otherwise false.
	 *         {@link BinaryRelations#DEFAULT_COMPARISON_EPSILON}
	 *
	 * @see BinaryRelations#DEFAULT_COMPARISON_EPSILON
	 */
	public static boolean isInteger(double x) {
		if (Double.isNaN(x)) return false;
		if (x == Double.POSITIVE_INFINITY) return false;
		if (x == Double.NEGATIVE_INFINITY) return false;
		if (x < 0) x = -x;
		double round = Math.round(x);
		if (Math.abs(x - round) < BinaryRelations.DEFAULT_COMPARISON_EPSILON) return true;
		else return false;
	}
	/**
	 * Check whether two double values are almost equal.
	 * @param a   First number
	 * @param b   Second number
	 * @return True if double values are almost equal, otherwise false.
	 *         {@link BinaryRelations#DEFAULT_COMPARISON_EPSILON}
	 *
	 * @see BinaryRelations#DEFAULT_COMPARISON_EPSILON
	 */
	public static boolean almostEqual(double a, double b) {
		if (Double.isNaN(a)) return false;
		if (Double.isNaN(b)) return false;
		if (a == b) return true;
		if (Math.abs(a - b) <= BinaryRelations.DEFAULT_COMPARISON_EPSILON) return true;
		return false;
	}
}