/*
 * @(#)mXparser.java        5.1.0    2022-09-04
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
package org.mariuszgromada.math.mxparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

import org.mariuszgromada.math.mxparser.mathcollection.BinaryRelations;
import org.mariuszgromada.math.mxparser.mathcollection.NumberTheory;
import org.mariuszgromada.math.mxparser.mathcollection.PrimesCache;
import org.mariuszgromada.math.mxparser.mathcollection.ProbabilityDistributions;
import org.mariuszgromada.math.mxparser.parsertokens.BinaryRelation;
import org.mariuszgromada.math.mxparser.parsertokens.BitwiseOperator;
import org.mariuszgromada.math.mxparser.parsertokens.BooleanOperator;
import org.mariuszgromada.math.mxparser.parsertokens.CalculusOperator;
import org.mariuszgromada.math.mxparser.parsertokens.ConstantValue;
import org.mariuszgromada.math.mxparser.parsertokens.Function1Arg;
import org.mariuszgromada.math.mxparser.parsertokens.Function2Arg;
import org.mariuszgromada.math.mxparser.parsertokens.Function3Arg;
import org.mariuszgromada.math.mxparser.parsertokens.FunctionVariadic;
import org.mariuszgromada.math.mxparser.parsertokens.KeyWord;
import org.mariuszgromada.math.mxparser.parsertokens.Operator;
import org.mariuszgromada.math.mxparser.parsertokens.ParserSymbol;
import org.mariuszgromada.math.mxparser.parsertokens.RandomVariable;
import org.mariuszgromada.math.mxparser.parsertokens.Token;
import org.mariuszgromada.math.mxparser.parsertokens.Unit;
/**
 * mXparser class provides usefull methods when parsing, calculating or
 * parameters transforming.
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
 * @version        5.1.0
 *
 * @see RecursiveArgument
 * @see Expression
 * @see Function
 * @see Constant
 */
public final class mXparser {
	/**
	 * mXparser version
	 */
	public static final String VERSION = "5.1.0";
	public static final String VERSION_CODE_NAME = "Libris";
	public static final String VERSION_NAME = VERSION + " " + VERSION_CODE_NAME;
	/**
	 * Framework used to compile mXparser
	 */
	public static final String BUIT_FOR = "JDK 8";
	/**
	 * FOUND / NOT_FOUND
	 * used for matching purposes
	 */
	static final int NOT_FOUND = -1;
	static final int FOUND = 0;
	/**
	 * Console output string  for below methods
	 *
	 * @see #consolePrintln(Object)
	 * @see #consolePrint(Object)
	 */
	private static volatile String CONSOLE_OUTPUT = "";
	private static volatile String CONSOLE_PREFIX = "[mXparser-v." + VERSION + "] ";
	private static volatile String CONSOLE_OUTPUT_PREFIX = CONSOLE_PREFIX;
	private static volatile int CONSOLE_ROW_NUMBER = 1;
	/**
	 * Prime numbers cache
	 */
	public volatile static PrimesCache primesCache;
	public static final int PRIMES_CACHE_NOT_INITIALIZED = -1;
	/**
	 * Threads number settings
	 */
	private static int THREADS_NUMBER = Runtime.getRuntime().availableProcessors();
	/**
	 * Double floating-point precision arithmetic causes
	 *
	 * mXparser provides intelligent ULP rounding to avoid some
	 * type of this errors.
	 */
	static volatile boolean ulpRounding = false;
	/**
	 * Double floating-point precision arithmetic causes
	 * rounding problems, i.e. 0.1 + 0.1 + 0.1 is different than 0.3
	 *
	 * mXparser provides intelligent canonical rounding to avoid majority
	 * of this errors.
	 *
	 */
	static volatile boolean canonicalRounding = true;
	/**
	 * Indicator marking whether to round final result
	 * to precise integer when result is very close
	 * to integer, solves problems like
	 * sin(pi) = 0
	 */
	static volatile boolean almostIntRounding = true;
	static final int DEFAULT_MAX_RECURSION_CALLS = 200;
	/**
	 * Internal limit for counter to avoid infinite loops while calculating
	 * expression defined in the way shown by below examples
	 *
	 * Argument x = new Argument("x = 2*y");
	 * Argument y = new Argument("y = 2*x");
	 * x.addDefinitions(y);
	 * y.addDefinitions(x);
	 *
	 * Function f = new Function("f(x) = 2*g(x)");
	 * Function g = new Function("g(x) = 2*f(x)");
	 * f.addDefinitions(g);
	 * g.addDefinitions(f);
	 */
	static volatile int MAX_RECURSION_CALLS = DEFAULT_MAX_RECURSION_CALLS;
	/**
	 * List of built-in tokens to remove.
	 */
	static volatile List<String> tokensToRemove = new ArrayList<String>();
	/**
	 * List of built-in tokens to modify
	 */
	static volatile List<TokenModification> tokensToModify = new ArrayList<TokenModification>();
	/**
	 * Indicator whether mXparser operates in radians / degrees mode
	 * true - degrees mode
	 * false - radians mode
	 *
	 * Default false (radians mode)
	 */
	static volatile boolean degreesMode = false;
	/**
	 * Indicator whether user defined tokens should override
	 * built-in tokens.
	 */
	static volatile boolean overrideBuiltinTokens = false;
	/**
	 * Implied multiplication mode
	 */
	static volatile boolean impliedMultiplicationMode = true;
	/**
	 * Internal indicator informing hte parser
	 * that unicode know keywords are enabled
	 * and will be recognized by the parser
	 * as built-in functions or operators
	 */
	static volatile boolean unicodeKeyWordsEnabled = true;
	/**
	 * Internal indicator informing the parser
	 * whether t try to fix the expression String.
	 * For example, situations such as:
	 * "++" change to "+",
	 * "+-" changed tro "-"
	 * "-+" changed tro "-"
	 * "--" changed tro "-"
	 */
	static boolean attemptToFixExpStrEnabled = true;
	/**
	 * Options changeset
	 */
	static volatile int optionsChangesetNumber = 0;
	/**
	 * Indicator whether to call cancel current calculation
	 */
	private static volatile boolean cancelCurrentCalculationFlag = false;
	/**
	 * Empty expression for general help purposes.
	 */
	static volatile Expression mXparserExp = new Expression();
	/**
	 * Initialization of prime numbers cache.
	 * Cache size according to {@link PrimesCache#DEFAULT_MAX_NUM_IN_CACHE}
	 * @see PrimesCache
	 */
	public static void initPrimesCache() {
		primesCache = new PrimesCache();
	}
	/**
	 * Initialization of prime numbers cache.
	 * @param mximumNumberInCache The maximum integer number that
	 *                            will be stored in cache.
	 * @see PrimesCache
	 */
	public static void initPrimesCache(int mximumNumberInCache) {
		primesCache = new PrimesCache(mximumNumberInCache);
	}
	/**
	 * Initialization of prime numbers cache.
	 * @param primesCache The primes cache object
	 * @see PrimesCache
	 */
	public static void initPrimesCache(PrimesCache primesCache) {
		mXparser.primesCache = primesCache;
	}
	/**
	 * Returns true in case when primes cache initialization was successful,
	 * otherwise returns false.
	 *
	 * @return Returns true in case when primes cache initialization was successful,
	 * otherwise returns false.
	 */
	public static boolean isInitPrimesCacheSuccessful() {
		if (primesCache == null) return false;
		synchronized (primesCache) {
			return primesCache.isInitSuccessful();
		}
	}
	/**
	 * Sets {@link mXparser#primesCache} to null
	 */
	public static void setNoPrimesCache() {
		primesCache = null;
	}
	/**
	 * Returns maximum integer number in primes cache
	 * @return If primes cache was initialized then maximum number in
	 * primes cache, otherwise {@link mXparser#PRIMES_CACHE_NOT_INITIALIZED}
	 */
	public static int getMaxNumInPrimesCache() {
		if ( primesCache != null ) {
			synchronized (primesCache) {
				return primesCache.getMaxNumInCache();
			}
		} else
			return PRIMES_CACHE_NOT_INITIALIZED;
	}
	/**
	 * Gets maximum threads number
	 *
	 * @return Threads number.
	 */
	public static int getThreadsNumber() {
		return THREADS_NUMBER;
	}
	/**
	 * Sets default threads number
	 */
	public static void setDefaultThreadsNumber() {
		THREADS_NUMBER = Runtime.getRuntime().availableProcessors();
	}
	/**
	 * Sets threads number
	 *
	 * @param threadsNumber  Thread number.
	 */
	public static void setThreadsNumber(int threadsNumber) {
		if (threadsNumber > 0) THREADS_NUMBER = threadsNumber;
	}
	/**
	 * Calculates function f(x0) (given as expression) assigning Argument x = x0;
	 *
	 *
	 * @param      f                   the expression
	 * @param      x                   the argument
	 * @param      x0                  the argument value
	 *
	 * @return     f.calculate()
	 *
	 * @see        Expression
	 */
	public static double getFunctionValue(Expression f, Argument x, double x0) {
		x.setArgumentValue(x0);
		return f.calculate();
	}
	/**
	 * Converts List of double to double[]
	 *
	 * @param      numbers             the numbers list
	 *
	 * @return     numbers array
	 */
	public static double[] arrayList2double(List<Double> numbers) {
		if (numbers == null)
			return null;
		int size = numbers.size();
		double[] newNumbers = new double[size];
		for (int i = 0; i < size; i++)
			newNumbers[i] = numbers.get(i).doubleValue();
		return newNumbers;
	}
	/**
	 * Returns array of double values of the function f(i)
	 * calculated on the range: i = from to i = to by step = delta
	 *
	 * @param f            Function expression
	 * @param index        Index argument
	 * @param from         'from' value
	 * @param to           'to' value
	 * @param delta        'delta' step definition
	 * @return             Array of function values
	 */
	public static double[] getFunctionValues(Expression f, Argument index, double from, double to, double delta) {
		if ( (Double.isNaN(delta) ) || (Double.isNaN(from) ) || (Double.isNaN(to) ) || (delta == 0) )
			return null;
		int n = 0;
		double[] values;
		if ( (to >= from) && (delta > 0) ) {
			for (double i = from; i < to; i+=delta)
				n++;
			n++;
			values = new double[n];
			int j = 0;
			for (double i = from; i < to; i+=delta) {
				values[j] = getFunctionValue(f, index, i);
				j++;
			}
			values[j] = getFunctionValue(f, index, to);
		} else if ( (to <= from) && (delta < 0) ) {
			for (double i = from; i > to; i+=delta)
				n++;
			n++;
			values = new double[n];
			int j = 0;
			for (double i = from; i > to; i+=delta) {
				values[j] = getFunctionValue(f, index, i);
				j++;
			}
			values[j] = getFunctionValue(f, index, to);
		} else if (from == to) {
			n = 1;
			values = new double[n];
			values[0] = getFunctionValue(f, index, from);
		} else values = null;
		return values;
	}
	/**
	 * Modifies random generator used by the ProbabilityDistributions class.
	 *
	 * @param randomGenerator      Random generator.
	 * @see ProbabilityDistributions
	 * @see ProbabilityDistributions#randomGenerator
	 */
	public static void setRandomGenerator(Random randomGenerator) {
		if (randomGenerator != null) ProbabilityDistributions.randomGenerator = randomGenerator;
	}
	/**
	 * Sets comparison mode to EXACT.
	 * @see BinaryRelations
	 */
	public static void setExactComparison() {
		BinaryRelations.setExactComparison();
	}
	/**
	 * Sets comparison mode to EPSILON.
	 * @see BinaryRelations
	 */
	public static void setEpsilonComparison() {
		BinaryRelations.setEpsilonComparison();
	}
	/**
	 * Sets epsilon value.
	 * @param epsilon   Epsilon value (grater than 0).
	 *
	 * @see #setEpsilonComparison()
	 * @see BinaryRelations
	 */
	public static void setEpsilon(double epsilon) {
		BinaryRelations.setEpsilon(epsilon);
	}
	/**
	 * Sets default epsilon value.
	 *
	 * @see #setEpsilonComparison()
	 * @see BinaryRelations#DEFAULT_COMPARISON_EPSILON
	 * @see BinaryRelations
	 */
	public static void setDefaultEpsilon() {
		BinaryRelations.setDefaultEpsilon();
	}
	/**
	 * Returns current epsilon value.
	 * @return  Returns current epsilon value.
	 *
	 * @see #setEpsilonComparison()
	 * @see BinaryRelations
	 */
	public static double getEpsilon() {
		return BinaryRelations.getEpsilon();
	}
	/**
	 * Checks if epsilon comparison mode is active;
	 * @return  True if epsilon mode is active, otherwise returns false.
	 * @see #setEpsilonComparison()
	 * @see #setExactComparison()
	 * @see BinaryRelations
	 */
	public static boolean checkIfEpsilonMode() {
		return BinaryRelations.checkIfEpsilonMode();
	}
	/**
	 * Checks if exact comparison mode is active;
	 * @return  True if exact mode is active, otherwise returns false.
	 * @see #setEpsilonComparison()
	 * @see #setExactComparison()
	 * @see BinaryRelations
	 */
	public static boolean checkIfExactMode() {
		return BinaryRelations.checkIfExactMode();
	}
	/**
	 * Enables ULP rounding.
	 * Double floating-point precision arithmetic causes
	 * rounding problems, i.e. 0.1 + 0.1 + 0.1 is slightly different than 0.3,
	 * additionally doubles are having a lot of advantages
	 * providing flexible number representation regardless of
	 * number size. mXparser is fully based on double numbers
	 * and that is why is providing intelligent ULP rounding
	 * to minimize misleading results. By default this option is
	 * enabled resulting in automatic rounding only in some cases.
	 * Using this mode 0.1 + 0.1 + 0.1 = 0.3
	 */
	public static void enableUlpRounding() {
		ulpRounding = true;
	}
	/**
	 * Disables ULP rounding.
	 * Double floating-point precision arithmetic causes
	 * rounding problems, i.e. 0.1 + 0.1 + 0.1 is slightly different than 0.3,
	 * additionally doubles are having a lot of advantages
	 * providing flexible number representation regardless of
	 * number size. mXparser is fully based on double numbers
	 * and that is why is providing intelligent ULP rounding
	 * to minimize misleading results. By default this option is
	 * enabled resulting in automatic rounding only in some cases.
	 * Disabling this mode 0.1 + 0.1 + 0.1 will be slightly different than 0.3.
	 */
	public static void disableUlpRounding() {
		ulpRounding = false;
	}
	/**
	 * Enables / disables ULP rounding.
	 * Double floating-point precision arithmetic causes
	 * rounding problems, i.e. 0.1 + 0.1 + 0.1 is slightly different than 0.3,
	 * additionally doubles are having a lot of advantages
	 * providing flexible number representation regardless of
	 * number size. mXparser is fully based on double numbers
	 * and that is why is providing intelligent ULP rounding
	 * to minimize misleading results. By default this option is
	 * enabled resulting in automatic rounding only in some cases.
	 * Disabling this mode 0.1 + 0.1 + 0.1 will be slightly different than 0.3.
	 *
	 * @param ulpRoundingState    True to enable, false to disable
	 */
	public static void setUlpRounding(boolean ulpRoundingState) {
		ulpRounding = ulpRoundingState;
	}
	/**
	 * Double floating-point precision arithmetic causes
	 * rounding problems, i.e. 0.1 + 0.1 + 0.1 is slightly different than 0.3,
	 * additionally doubles are having a lot of advantages
	 * providing flexible number representation regardless of
	 * number size. mXparser is fully based on double numbers
	 * and that is why is providing intelligent ULP rounding
	 * to minimize misleading results. By default this option is
	 * enabled resulting in automatic rounding only in some cases.
	 * Using this mode 0.1 + 0.1 + 0.1 = 0.3
	 *
	 * @return True if ULP rounding is enabled, otherwise false.
	 */
	public static boolean checkIfUlpRounding() {
		return ulpRounding;
	}
	/**
	 * Enables canonical rounding.
	 * Double floating-point precision arithmetic causes
	 * rounding problems, i.e. 0.1 + 0.1 + 0.1 is slightly different than 0.3,
	 * additionally doubles are having a lot of advantages
	 * providing flexible number representation regardless of
	 * number size. mXparser is fully based on double numbers
	 * and that is why is providing intelligent canonical rounding
	 * to minimize misleading results. By default this option is
	 * enabled resulting in automatic rounding only in some cases.
	 * Using this mode 2.5 - 2.2 = 0.3
	 */
	public static void enableCanonicalRounding() {
		canonicalRounding = true;
	}
	/**
	 * Disables canonical rounding.
	 * Double floating-point precision arithmetic causes
	 * rounding problems, i.e. 0.1 + 0.1 + 0.1 is slightly different than 0.3,
	 * additionally doubles are having a lot of advantages
	 * providing flexible number representation regardless of
	 * number size. mXparser is fully based on double numbers
	 * and that is why is providing intelligent canonical rounding
	 * to minimize misleading results. By default this option is
	 * enabled resulting in automatic rounding only in some cases.
	 * Using this mode 2.5 - 2.2 = 0.3
	 */
	public static void disableCanonicalRounding() {
		canonicalRounding = false;
	}
	/**
	 * Enables / disables canonical rounding.
	 * Double floating-point precision arithmetic causes
	 * rounding problems, i.e. 0.1 + 0.1 + 0.1 is slightly different than 0.3,
	 * additionally doubles are having a lot of advantages
	 * providing flexible number representation regardless of
	 * number size. mXparser is fully based on double numbers
	 * and that is why is providing intelligent ULP rounding
	 * to minimize misleading results. By default this option is
	 * enabled resulting in automatic rounding only in some cases.
	 * Disabling this mode 0.1 + 0.1 + 0.1 will be slightly different than 0.3.
	 *
	 * @param canonicalRoundingState    True to enable, false to disable
	 */
	public static void setCanonicalRounding(boolean canonicalRoundingState) {
		canonicalRounding = canonicalRoundingState;
	}
	/**
	 * Double floating-point precision arithmetic causes
	 * rounding problems, i.e. 0.1 + 0.1 + 0.1 is slightly different than 0.3,
	 * additionally doubles are having a lot of advantages
	 * providing flexible number representation regardless of
	 * number size. mXparser is fully based on double numbers
	 * and that is why is providing intelligent canonical rounding
	 * to minimize misleading results. By default this option is
	 * enabled resulting in automatic rounding only in some cases.
	 * Using this mode 2.5 - 2.2 = 0.3
	 *
	 * @return True if Canonical rounding is enabled, otherwise false.
	 */
	public static boolean checkIfCanonicalRounding() {
		return canonicalRounding;
	}
	/**
	 * Enables almost integer rounding option causing
	 * rounding final calculation result to precise integer
	 * if and only if result is very close to integer.
	 * Very close condition depends on epsilon.
	 *
	 * @see mXparser#setEpsilon(double)
	 * @see mXparser#getEpsilon()
	 * @see Expression#calculate()
	 */
	public static void enableAlmostIntRounding() {
		almostIntRounding = true;
	}
	/**
	 * Disables almost integer rounding option causing
	 * rounding final calculation result to precise integer
	 * if and only if result is very close to integer.
	 * Very close condition depends on epsilon.
	 *
	 * @see mXparser#setEpsilon(double)
	 * @see mXparser#getEpsilon()
	 * @see Expression#calculate()
	 */
	public static void disableAlmostIntRounding() {
		almostIntRounding = false;
	}
	/**
	 * Enables / disables almost integer rounding option causing
	 * rounding final calculation result to precise integer
	 * if and only if result is very close to integer.
	 * Very close condition depends on epsilon.
	 *
	 * @param almostIntRoundingState    True to enable, false to disable
	 */
	public static void setAlmostIntRounding(boolean almostIntRoundingState) {
		almostIntRounding = almostIntRoundingState;
	}
	/**
	 * Returns state of almost integer rounding option causing
	 * rounding final calculation result to precise integer
	 * if and only if result is very close to integer.
	 * Very close condition depends on epsilon.
	 *
	 * @return true if option enabled, false otherwise
	 *
	 * @see mXparser#setEpsilon(double)
	 * @see mXparser#getEpsilon()
	 * @see Expression#calculate()
	 */
	public static boolean checkIfAlmostIntRounding() {
		return almostIntRounding;
	}
	/**
	 * Internal limit to avoid infinite loops while calculating
	 * expression defined in the way shown by below examples.
	 *
	 * Argument x = new Argument("x = 2*y");
	 * Argument y = new Argument("y = 2*x");
	 * x.addDefinitions(y);
	 * y.addDefinitions(x);
	 *
	 * Function f = new Function("f(x) = 2*g(x)");
	 * Function g = new Function("g(x) = 2*f(x)");
	 * f.addDefinitions(g);
	 * g.addDefinitions(f);
	 *
	 * Currently does not affect properly defined recursive mode.
	 *
	 * @param maxAllowedRecursionDepth  Maximum number of allowed recursion calls
	 */
	public static void setMaxAllowedRecursionDepth(int maxAllowedRecursionDepth) {
		MAX_RECURSION_CALLS = maxAllowedRecursionDepth;
	}
	/**
	 * Internal limit to avoid infinite loops while calculating
	 * expression defined in the way shown by below examples.
	 *
	 * Argument x = new Argument("x = 2*y");
	 * Argument y = new Argument("y = 2*x");
	 * x.addDefinitions(y);
	 * y.addDefinitions(x);
	 *
	 * Function f = new Function("f(x) = 2*g(x)");
	 * Function g = new Function("g(x) = 2*f(x)");
	 * f.addDefinitions(g);
	 * g.addDefinitions(f);
	 *
	 * Currently does not affect properly defined recursive mode.
	 *
	 * @return Max allowed recursion calls
	 */
	public static int getMaxAllowedRecursionDepth() {
		return MAX_RECURSION_CALLS;
	}
	/**
	 * Set mXparser to operate in radians mode for
	 * trigonometric functions
	 */
	public static void setRadiansMode() {
		degreesMode = false;
	}
	/**
	 * Set mXparser to operate in degrees mode for
	 * trigonometric functions
	 */
	public static void setDegreesMode() {
		degreesMode = true;
	}
	/**
	 * Checks whether mXparser operates in radians mode for
	 * trigonometric functions.
	 *
	 * @return true - if radians mode, false - otherwise
	 */
	public static boolean checkIfRadiansMode() {
		return !degreesMode;
	}
	/**
	 * Checks whether mXparser operates in degrees mode for
	 * trigonometric functions.
	 *
	 * @return true - if degrees mode, false - otherwise
	 */
	public static boolean checkIfDegreesMode() {
		return degreesMode;
	}
	/**
	 * Sets implied multiplication
	 */
	public static void enableImpliedMultiplicationMode() {
		impliedMultiplicationMode = true;
		mXparserExp.enableImpliedMultiplicationMode();
	}
	/**
	 * Disables implied multiplication
	 */
	public static void disableImpliedMultiplicationMode() {
		impliedMultiplicationMode = false;
		mXparserExp.disableImpliedMultiplicationMode();
	}
	/**
	 * Gets implied multiplication status
	 *
	 * @return     true if implied multiplication is enabled,
	 *             otherwise returns false.
	 */
	public static boolean checkIfImpliedMultiplicationMode() {
		return impliedMultiplicationMode;
	}
	/**
	 * Enables unicode built-in parser keywords, this flag
	 * informs the parser that built-in unicode keywords
	 * are supported and will be recognized as functions or
	 * operators.
	 */
	public static void enableUnicodeBuiltinKeyWordsMode() {
		unicodeKeyWordsEnabled = true;
		mXparserExp.enableUnicodeBuiltinKeyWordsMode();
	}
	/**
	 * Disables unicode built-in parser keywords, this flag
	 * informs the parser that built-in unicode keywords
	 * are not supported and will not be recognized as functions or
	 * operators.
	 */
	public static void disableUnicodeBuiltinKeyWordsMode() {
		unicodeKeyWordsEnabled = false;
		mXparserExp.disableUnicodeBuiltinKeyWordsMode();
	}
	/**
	 * Gets unicode built-in parser keywords mode
	 *
	 * @return     true if unicode built-in parser keywords is enabled,
	 *             otherwise returns false.
	 */
	public static boolean checkIfUnicodeBuiltinKeyWordsMode() {
		return unicodeKeyWordsEnabled;
	}
	/**
	 * Enables attempt to fix the expression String.
	 * For example, situations such as:
	 * "++" change to "+",
	 * "+-" changed tro "-"
	 * "-+" changed tro "-"
	 * "--" changed tro "-"
	 */
	public static void enableAttemptToFixExpStrMode() {
		attemptToFixExpStrEnabled = true;
	}
	/**
	 * Disables attempt to fix the expression String.
	 * For example, situations such as:
	 * "++" change to "+",
	 * "+-" changed tro "-"
	 * "-+" changed tro "-"
	 * "--" changed tro "-"
	 */
	public static void disableAttemptToFixExpStrMode() {
		attemptToFixExpStrEnabled = false;
	}
	/**
	 * Gets attempt to fix expression string mode
	 *
	 * @return     true attempt to fix expression string mode is enabled,
	 *             otherwise returns false.
	 */
	public static boolean checkIfAttemptToFixExpStrMode() {
		return attemptToFixExpStrEnabled;
	}
	/**
	 * Sets initial search size for the toFraction method
	 *
	 * @param n initial search size, has to be non-zero positive.
	 * @see NumberTheory#toFraction(double)
	 */
	public static void setToFractionInitSearchSize(long n) {
		NumberTheory.setToFractionInitSearchSize(n);
	}
	/**
	 * Gets initial search size used by the toFraction method
	 *
	 * @return initial search size used by the toFraction method
	 * @see NumberTheory#toFraction(double)
	 */
	public static long getToFractionInitSearchSize() {
		return NumberTheory.getToFractionInitSearchSize();
	}
	/**
	 * Removes built-in tokens form the list of tokens recognized by the parsers.
	 * Procedure affects only tokens classified to built-in functions, built-in
	 * constants, built-in units, built-in random variables.
	 *
	 * @param tokens  List of tokens to remove.
	 */
	public static void removeBuiltinTokens(String... tokens) {
		if (tokens == null) return;
		synchronized (tokensToRemove) {
			for (String token : tokens)
				if (token != null)
					if (token.length() > 0)
						if (!tokensToRemove.contains(token))
							tokensToRemove.add(token);
			optionsChangesetNumber++;
		}
	}
	/**
	 * Un-marks tokens previously marked to be removed.
	 * @param tokens List of tokens to un-mark.
	 */
	public static void unremoveBuiltinTokens(String... tokens) {
		if (tokens == null) return;
		if (tokens.length == 0) return;
		if (tokensToRemove.size() == 0) return;
		synchronized (tokensToRemove) {
			for (String token : tokens)
				if (token != null)
					tokensToRemove.remove(token);
			optionsChangesetNumber++;
		}
	}
	/**
	 * Un-marks all tokens previously marked to be removed.
	 */
	public static void unremoveAllBuiltinTokens() {
		synchronized (tokensToRemove) {
			tokensToRemove.clear();
			optionsChangesetNumber++;
		}
	}
	/**
	 * Returns current list of tokens marked to be removed.
	 * @return Current list of tokens marked to be removed
	 */
	public static String[] getBuiltinTokensToRemove() {
		synchronized (tokensToRemove) {
			int tokensNum = tokensToRemove.size();
			String[] tokensToRemoveArray = new String[tokensNum];
			for (int i = 0; i < tokensNum; i++)
				tokensToRemoveArray[i] = tokensToRemove.get(i);
			return tokensToRemoveArray;
		}
	}
	/**
	 * Method to change definition of built-in token - more precisely
	 * using this method allows to modify token string recognized by the parser
	 * (i.e. sin(x) to sinus(x)).
	 * Procedure affects only tokens classified to built-in functions, built-in
	 * constants, built-in units, built-in random variables.
	 * @param currentToken     Current token name
	 * @param newToken         New token name
	 */
	public static void modifyBuiltinToken(String currentToken, String newToken) {
		if (currentToken == null) return;
		if (currentToken.length() == 0) return;
		if (newToken == null) return;
		if (newToken.length() == 0) return;
		synchronized (tokensToModify) {
			for (TokenModification tm : tokensToModify)
				if (tm.currentToken.equals(currentToken)) return;
			TokenModification tma = new TokenModification();
			tma.currentToken = currentToken;
			tma.newToken = newToken;
			tma.newTokenDescription = null;
			tokensToModify.add(tma);
			optionsChangesetNumber++;
		}
	}
	/**
	 * Method to change definition of built-in token - more precisely
	 * using this method allows to modify token string recognized by the parser
	 * (i.e. sin(x) to sinus(x)).
	 * Procedure affects only tokens classified to built-in functions, built-in
	 * constants, built-in units, built-in random variables.
	 * @param currentToken          Current token name
	 * @param newToken              New token name
	 * @param newTokenDescription   New token description (if null the previous one will be used)
	 */
	public static void modifyBuiltinToken(String currentToken, String newToken, String newTokenDescription) {
		if (currentToken == null) return;
		if (currentToken.length() == 0) return;
		if (newToken == null) return;
		if (newToken.length() == 0) return;
		synchronized (tokensToModify) {
			for (TokenModification tm : tokensToModify)
				if (tm.currentToken.equals(currentToken)) return;
			TokenModification tma = new TokenModification();
			tma.currentToken = currentToken;
			tma.newToken = newToken;
			tma.newTokenDescription = newTokenDescription;
			tokensToModify.add(tma);
			optionsChangesetNumber++;
		}
	}
	/**
	 * Un-marks tokens previously marked to be modified.
	 * @param currentOrNewTokens   List of tokens to be un-marked (current or modified).
	 */
	public static void unmodifyBuiltinTokens(String... currentOrNewTokens) {
		if (currentOrNewTokens == null) return;
		if (currentOrNewTokens.length == 0) return;
		if (tokensToModify.size() == 0) return;
		synchronized (tokensToModify) {
			List<TokenModification> toRemove = new ArrayList<TokenModification>();
			for (String token : currentOrNewTokens)
				if (token != null)
					if (token.length() > 0) {
						for (TokenModification tm : tokensToModify)
							if ( (token.equals(tm.currentToken)) || (token.equals(tm.newToken)) ) toRemove.add(tm);
					}
			for (TokenModification tm : toRemove)
				tokensToModify.remove(tm);
			optionsChangesetNumber++;
		}
	}
	/**
	 * Un-marks all tokens previously marked to be modified.
	 */
	public static void unmodifyAllBuiltinTokens() {
		synchronized (tokensToModify) {
			tokensToModify.clear();
			optionsChangesetNumber++;
		}
	}
	/**
	 * Return details on tokens marked to be modified.
	 * @return String[i][0] - current token, String[i][1] - new token,
	 *                        String[i][2] - new token description.
	 */
	public static String[][] getBuiltinTokensToModify() {
		synchronized (tokensToModify) {
			int tokensNum = tokensToModify.size();
			String[][] tokensToModifyArray = new String[tokensNum][3];
			for (int i = 0; i < tokensNum; i++) {
				TokenModification tm = tokensToModify.get(i);
				tokensToModifyArray[i][0] = tm.currentToken;
				tokensToModifyArray[i][1] = tm.newToken;
				tokensToModifyArray[i][2] = tm.newTokenDescription;
			}
			return tokensToModifyArray;
		}
	}
	/**
	 * Sets mXparser to override built-in tokens
	 * by user defined tokens.
	 */
	public static synchronized void setToOverrideBuiltinTokens() {
		overrideBuiltinTokens = true;
		optionsChangesetNumber++;
	}
	/**
	 * Sets mXparser not to override built-in tokens
	 * by user defined tokens.
	 */
	public static synchronized void setNotToOverrideBuiltinTokens() {
		overrideBuiltinTokens = false;
		optionsChangesetNumber++;
	}
	/**
	 * Checks whether mXparser is set to override built-in tokens.
	 *
	 * @return True if mXparser is set to override built-in tokens by
	 *         user defined tokens, otherwise false.
	 */
	public static boolean checkIfsetToOverrideBuiltinTokens() {
		return overrideBuiltinTokens;
	}
	/**
	 * Sets default mXparser options
	 *
	 */
	public static synchronized void setDefaultOptions() {
		enableUlpRounding();
		enableAlmostIntRounding();
		setMaxAllowedRecursionDepth(DEFAULT_MAX_RECURSION_CALLS);
		setNotToOverrideBuiltinTokens();
		unmodifyAllBuiltinTokens();
		setRadiansMode();
		resetCancelCurrentCalculationFlag();
		setDefaultEpsilon();
		setEpsilonComparison();
		setToFractionInitSearchSize(NumberTheory.DEFAULT_TO_FRACTION_INIT_SEARCH_SIZE);
		enableImpliedMultiplicationMode();
		enableUnicodeBuiltinKeyWordsMode();
		enableAttemptToFixExpStrMode();
		optionsChangesetNumber++;
	}
	/**
	 * Returns token type description.
	 *
	 * @param tokenTypeId Token type id
	 * @return String representing token type description.
	 */
	public static String getTokenTypeDescription(int tokenTypeId) {
		String type = "";
		switch (tokenTypeId) {
			case ParserSymbol.TYPE_ID: type = ParserSymbol.TYPE_DESC; break;
			case ParserSymbol.NUMBER_TYPE_ID: type = "Number"; break;
			case Operator.TYPE_ID: type = Operator.TYPE_DESC; break;
			case BooleanOperator.TYPE_ID: type = BooleanOperator.TYPE_DESC; break;
			case BinaryRelation.TYPE_ID: type = BinaryRelation.TYPE_DESC; break;
			case Function1Arg.TYPE_ID: type = Function1Arg.TYPE_DESC; break;
			case Function2Arg.TYPE_ID: type = Function2Arg.TYPE_DESC; break;
			case Function3Arg.TYPE_ID: type = Function3Arg.TYPE_DESC; break;
			case FunctionVariadic.TYPE_ID: type = FunctionVariadic.TYPE_DESC; break;
			case CalculusOperator.TYPE_ID: type = CalculusOperator.TYPE_DESC; break;
			case RandomVariable.TYPE_ID: type = RandomVariable.TYPE_DESC; break;
			case ConstantValue.TYPE_ID: type = ConstantValue.TYPE_DESC; break;
			case Argument.TYPE_ID: type = Argument.TYPE_DESC; break;
			case RecursiveArgument.TYPE_ID_RECURSIVE: type = RecursiveArgument.TYPE_DESC_RECURSIVE; break;
			case Function.TYPE_ID: type = Function.TYPE_DESC; break;
			case Constant.TYPE_ID: type = Constant.TYPE_DESC; break;
			case Unit.TYPE_ID: type = Unit.TYPE_DESC; break;
			case BitwiseOperator.TYPE_ID: type = BitwiseOperator.TYPE_DESC; break;
		}
		return type;
	}
	/**
	 * Converts integer number to hex string (plain text)
	 *
	 * @param number   Integer number
	 * @return         Hex string (i.e. FF23)
	 */
	public static String numberToHexString(int number) {
		return Integer.toHexString(number);
	}
	/**
	 * Converts long number to hex string (plain text)
	 *
	 * @param number   Long number
	 * @return         Hex string (i.e. FF23)
	 */
	public static String numberToHexString(long number) {
		return Long.toHexString(number);
	}
	/**
	 * Converts (long)double number to hex string (plain text)
	 *
	 * @param number   Double number
	 * @return         Hex string (i.e. FF23)
	 */
	public static String numberToHexString(double number) {
		return numberToHexString((long)number);
	}
	/**
	 * Converts hex string into ASCII string, where each letter is
	 * represented by two hex digits (byte) from the hex string.
	 *
	 * @param hexString   Hex string (i.e. 48656C6C6F)
	 * @return         ASCII string (i.e. '48656C6C6F' = 'Hello')
	 */
	public static String hexString2AsciiString(String hexString) {
		String hexByteStr;
		int hexByteInt;
		String asciiString = "";
		for (int i = 0; i < hexString.length(); i+=2) {
			hexByteStr = hexString.substring(i, i+2);
			hexByteInt = Integer.parseInt(hexByteStr, 16);
			asciiString = asciiString + (char)hexByteInt;
		}
		return asciiString;
	}
	/**
	 * Converts number into ASCII string, where each letter is
	 * represented by two hex digits (byte) from the hex representation
	 * of the original number
	 *
	 * @param number   Integer number (i.e. 310939249775 = '48656C6C6F')
	 * @return         ASCII string (i.e. '48656C6C6F' = 'Hello')
	 */
	public static String numberToAsciiString(int number) {
		return hexString2AsciiString( numberToHexString(number) );
	}
	/**
	 * Converts number into ASCII string, where each letter is
	 * represented by two hex digits (byte) from the hex representation
	 * of the original number
	 *
	 * @param number   Long number (i.e. 310939249775 = '48656C6C6F')
	 * @return         ASCII string (i.e. '48656C6C6F' = 'Hello')
	 */
	public static String numberToAsciiString(long number) {
		return hexString2AsciiString( numberToHexString(number) );
	}
	/**
	 * Converts (long)double number into ASCII string, where each letter is
	 * represented by two hex digits (byte) from the hex representation
	 * of the original number casted to long type.
	 *
	 * @param number   Double number (i.e. 310939249775 = '48656C6C6F')
	 * @return         ASCII string (i.e. '48656C6C6F' = 'Hello')
	 */
	public static String numberToAsciiString(double number) {
		return hexString2AsciiString( numberToHexString(number) );
	}
	/**
	 * Other base (base between 1 and 36) number literal conversion to decimal number.
	 *
	 * @param numberLiteral    Number literal in given numeral system with base between
	 *                         1 and 36. Digits: 0:0, 1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7,
	 *                         8:8, 9:9, 10:A, 11:B, 12:C, 13:D, 14:E, 15:F, 16:G, 17:H,
	 *                         18:I, 19:J, 20:K, 21:L, 22:M, 23:N, 24:O, 25:P, 26:Q, 27:R,
	 *                         28:S, 29:T, 30:U, 31:V, 32:W, 33:X, 34:Y, 35:Z
	 * @param numeralSystemBase             Numeral system base, between 1 and 36
	 * @return                 Decimal number after conversion. If conversion was not
	 *                         possible the Double.NaN is returned.
	 */
	public static double convOthBase2Decimal(String numberLiteral, int numeralSystemBase) {
		return NumberTheory.convOthBase2Decimal(numberLiteral, numeralSystemBase);
	}
	/**
	 * Other base (base between 1 and 36) number literal conversion to decimal number.
	 * Base specification included in number literal.
	 *
	 * Examples: 2 for b2.1001 or b.1001, 1 for b1.111, 23 for b23.123afg
	 * 16 for b16.123acdf or h.123acdf.
	 *
	 * @param numberLiteral Number literal string.
	 *
	 * Base format: b1. b2. b. b3. b4. b5. b6. b7. b8. o. b9. b10. b11. b12.
	 * b13. b14. b15. b16. h. b17. b18. b19. b20. b21. b22. b23. b24. b25. b26.
	 * b27. b28. b29. b30. b31. b32. b33. b34. b35. b36.
	 *
	 * Digits: 0:0, 1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7, 8:8, 9:9, 10:A, 11:B, 12:C,
	 * 13:D, 14:E, 15:F, 16:G, 17:H, 18:I, 19:J, 20:K, 21:L, 22:M, 23:N, 24:O, 25:P,
	 * 26:Q, 27:R, 28:S, 29:T, 30:U, 31:V, 32:W, 33:X, 34:Y, 35:Z
	 *
	 * @return     Decimal number after conversion. If conversion was not
	 *             possible the Double.NaN is returned.
	 */
	public static double convOthBase2Decimal(String numberLiteral) {
		return NumberTheory.convOthBase2Decimal(numberLiteral);
	}
	/**
	 * Other base to decimal conversion.
	 *
	 * @param numeralSystemBase   Numeral system base has to be above 0.
	 * @param digits              List of digits
	 * @return                    Number after conversion. If conversion is not possible then
	 *                            Double.NaN is returned.
	 */
	public static double convOthBase2Decimal(int numeralSystemBase, int... digits) {
		return NumberTheory.convOthBase2Decimal(numeralSystemBase, digits);
	}
	/**
	 * Other base to decimal conversion.
	 *
	 * @param numeralSystemBase   Numeral system base has to be above 0.
	 * @param digits              List of digits
	 * @return                    Number after conversion. If conversion is not possible then
	 *                            Double.NaN is returned.
	 */
	public static double convOthBase2Decimal(double numeralSystemBase, double... digits) {
		return NumberTheory.convOthBase2Decimal(numeralSystemBase, digits);
	}
	/**
	 * Decimal number to other numeral system conversion with base
	 * between 1 and 36.
	 *
	 * @param decimalNumber    Decimal number
	 * @param numeralSystemBase       Numeral system base between 1 and 36
	 * @return           Number literal representing decimal number in
	 *                   given numeral numeral system. Digits
	 *                   0:0, 1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7, 8:8,
	 *                   9:9, 10:A, 11:B, 12:C, 13:D, 14:E, 15:F, 16:G,
	 *                   17:H, 18:I, 19:J, 20:K, 21:L, 22:M, 23:N, 24:O,
	 *                   25:P, 26:Q, 27:R, 28:S, 29:T, 30:U, 31:V, 32:W,
	 *                   33:X, 34:Y, 35:Z. If conversion was not possible
	 *                   the "NaN" string is returned.
	 */
	public static String convDecimal2OthBase(double decimalNumber, int numeralSystemBase) {
		return NumberTheory.convDecimal2OthBase(decimalNumber, numeralSystemBase);
	}
	/**
	 * Decimal number to other numeral system conversion with base
	 * between 1 and 36.
	 *
	 * @param decimalNumber    Decimal number
	 * @param numeralSystemBase       Numeral system base between 1 and 36
	 * @param format     If 1 then always bxx. is used, i.e. b1. or b16.
	 *                   If 2 then for binary b. is used, for octal o. is used,
	 *                   for hexadecimal h. is used, otherwise bxx. is used
	 *                   where xx is the numeral system base specification.
	 *
	 * @return           Number literal representing decimal number in
	 *                   given numeral numeral system.
	 *
	 * Base format: b1. b2. b. b3. b4. b5. b6. b7. b8. o. b9. b10. b11. b12.
	 * b13. b14. b15. b16. h. b17. b18. b19. b20. b21. b22. b23. b24. b25. b26.
	 * b27. b28. b29. b30. b31. b32. b33. b34. b35. b36.
	 *
	 * Digits: 0:0, 1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7, 8:8, 9:9, 10:A, 11:B, 12:C,
	 * 13:D, 14:E, 15:F, 16:G, 17:H, 18:I, 19:J, 20:K, 21:L, 22:M, 23:N, 24:O, 25:P,
	 * 26:Q, 27:R, 28:S, 29:T, 30:U, 31:V, 32:W, 33:X, 34:Y, 35:Z
	 *
	 * If conversion was not possible the "NaN" string is returned.
	 */
	public static String convDecimal2OthBase(double decimalNumber, int numeralSystemBase, int format) {
		return NumberTheory.convDecimal2OthBase(decimalNumber, numeralSystemBase, format);
	}
	/**
	 * Converts double value to its fraction representation.
	 *
	 * @param value Value to be converted
	 *
	 * @return Array representing fraction. Sign at index 0,
	 * numerator at index 1, denominator at index 2.
	 * If conversion is not possible then Double.NaN is
	 * assigned to all the fields.
	 */
	public static double[] toFraction(double value) {
		return NumberTheory.toFraction(value);
	}
	/**
	 * Converts double value to its mixed fraction representation.
	 *
	 * @param value Value to be converted
	 *
	 * @return Array representing fraction.
	 * Sign at index 0, whole number at index 1,
	 * numerator at index 2, denominator at index 3.
	 * If conversion is not possible then Double.NaN is
	 * assigned to both numerator and denominator.
	 */
	public static double[] toMixedFraction(double value) {
		return NumberTheory.toMixedFraction(value);
	}
	/**
	 * Converts array representing fraction to fraction string representation.
	 *
	 * @param fraction    Array representing fraction (including mix fractions)
	 * @return  String representation of fraction.
	 *
	 * @see NumberTheory#toFraction(double)
	 * @see NumberTheory#toMixedFraction(double)
	 */
	public static String fractionToString(double[] fraction) {
		return NumberTheory.fractionToString(fraction);
	}
	/**
	 * Converts number to its fraction string representation.
	 *
	 * @param value   Given number
	 * @return  String representation of fraction.
	 *
	 * @see NumberTheory#toFraction(double)
	 * @see NumberTheory#fractionToString(double[])
	 */
	public static String toFractionString(double value) {
		return NumberTheory.toFractionString(value);
	}
	/**
	 * Converts number to its mixed fraction string representation.
	 *
	 * @param value   Given number
	 * @return  String representation of fraction.
	 *
	 * @see NumberTheory#toMixedFraction(double)
	 * @see NumberTheory#fractionToString(double[])
	 */
	public static String toMixedFractionString(double value) {
		return NumberTheory.toMixedFractionString(value);
	}
	/**
	 * Prints object.toString to the Console + new line
	 *
	 * @param o    Object to print
	 */
	public static void consolePrintln(Object o) {
		synchronized (CONSOLE_OUTPUT) {
			if ((CONSOLE_ROW_NUMBER == 1) && (CONSOLE_OUTPUT.equals(""))) {
				System.out.print(CONSOLE_PREFIX);
				CONSOLE_OUTPUT = CONSOLE_PREFIX;
			}
			System.out.println(o);
			CONSOLE_ROW_NUMBER++;
			System.out.print(CONSOLE_PREFIX);
			CONSOLE_OUTPUT = CONSOLE_OUTPUT + o + "\n" + CONSOLE_OUTPUT_PREFIX;
		}
	}
	/**
	 * Prints array of strings
	 *
	 * @param stringArray  array of strinfs
	 */
	public static void consolePrintln(String[] stringArray) {
		if (stringArray == null) {
			consolePrintln("null");
			return;
		}
		for (String s : stringArray)
			consolePrintln(s);
	}
	/**
	 * Prints new line to the Console, no new line
	 *
	 */
	public static void consolePrintln() {
		synchronized (CONSOLE_OUTPUT) {
			if ((CONSOLE_ROW_NUMBER == 1) && (CONSOLE_OUTPUT.equals(""))) {
				System.out.print(CONSOLE_PREFIX);
				CONSOLE_OUTPUT = CONSOLE_PREFIX;
			}
			System.out.println();
			CONSOLE_ROW_NUMBER++;
			System.out.print(CONSOLE_PREFIX);
			CONSOLE_OUTPUT = CONSOLE_OUTPUT + "\n" + CONSOLE_OUTPUT_PREFIX;
		}
	}
	/**
	 * Prints object.toString to the Console
	 *
	 * @param o    Object to print
	 */
	public static void consolePrint(Object o) {
		synchronized (CONSOLE_OUTPUT) {
			if ((CONSOLE_ROW_NUMBER == 1) && (CONSOLE_OUTPUT.equals(""))) {
				System.out.print(CONSOLE_PREFIX);
				CONSOLE_OUTPUT = CONSOLE_PREFIX;
			}
			System.out.print(o);
			CONSOLE_OUTPUT = CONSOLE_OUTPUT + o;
		}
	}
	public static void consolePrintSettings(String prefix) {
		mXparser.consolePrintln(prefix + "checkIfCanonicalRounding = " + mXparser.checkIfCanonicalRounding());
		mXparser.consolePrintln(prefix + "checkIfAlmostIntRounding = " + mXparser.checkIfAlmostIntRounding());
		mXparser.consolePrintln(prefix + "checkIfUlpRounding = " + mXparser.checkIfUlpRounding());
		mXparser.consolePrintln(prefix + "checkIfRadiansMode = " + mXparser.checkIfRadiansMode());
		mXparser.consolePrintln(prefix + "checkIfDegreesMode = " + mXparser.checkIfDegreesMode());
		mXparser.consolePrintln(prefix + "checkIfExactMode = " + mXparser.checkIfExactMode());
		mXparser.consolePrintln(prefix + "checkIfEpsilonMode = " + mXparser.checkIfEpsilonMode());
		mXparser.consolePrintln(prefix + "getEpsilon = " + mXparser.getEpsilon());
		mXparser.consolePrintln(prefix + "getMaxAllowedRecursionDepth = " + mXparser.getMaxAllowedRecursionDepth());
		mXparser.consolePrintln(prefix + "getMaxNumInPrimesCache = " + mXparser.getMaxNumInPrimesCache());
		mXparser.consolePrintln(prefix + "getToFractionInitSearchSize = " + mXparser.getToFractionInitSearchSize());
		mXparser.consolePrintln(prefix + "checkIfsetToOverrideBuiltinTokens = " + mXparser.checkIfsetToOverrideBuiltinTokens());
		mXparser.consolePrintln(prefix + "Java version = " + System.getProperty("java.version"));
	}
	public static void consolePrintSettings() {
		consolePrintSettings("");
	}
	/**
	 * Resets console output string, console output
	 * string is being built by consolePrintln(), consolePrint().
	 *
	 * @see mXparser#consolePrint(Object)
	 * @see mXparser#consolePrintln(Object)
	 * @see mXparser#consolePrintln()
	 * @see mXparser#resetConsoleOutput()
	 */
	public static void resetConsoleOutput() {
		synchronized (CONSOLE_OUTPUT) {
			CONSOLE_OUTPUT = "";
			CONSOLE_ROW_NUMBER = 1;
		}
	}
	/**
	 * Sets default console prefix.
	 */
	public static void setDefaultConsolePrefix() {
		synchronized (CONSOLE_PREFIX) {
			CONSOLE_PREFIX = "[mXparser-v." + VERSION + "] ";
		}
	}
	/**
	 * Sets default console output string prefix.
	 */
	public static void setDefaultConsoleOutputPrefix() {
		synchronized (CONSOLE_OUTPUT_PREFIX) {
			CONSOLE_OUTPUT_PREFIX = "[mXparser-v." + VERSION + "] ";
		}
	}
	/**
	 * Sets console prefix.
	 *
	 * @param consolePrefix String containing console prefix definition.
	 */
	public static void setConsolePrefix(String consolePrefix) {
		synchronized (CONSOLE_PREFIX) {
			CONSOLE_PREFIX = consolePrefix;
		}
	}
	/**
	 * Sets console output string prefix.
	 *
	 * @param consoleOutputPrefix String containing console output prefix definition.
	 */
	public static void setConsoleOutputPrefix(String consoleOutputPrefix) {
		synchronized (CONSOLE_OUTPUT_PREFIX) {
			CONSOLE_OUTPUT_PREFIX = consoleOutputPrefix;
		}
	}
	/**
	 * Returns console output string, console output string
	 * is being built by consolePrintln(), consolePrint().
	 *
	 * @return Console output string
	 *
	 * @see mXparser#consolePrint(Object)
	 * @see mXparser#consolePrintln(Object)
	 * @see mXparser#consolePrintln()
	 * @see mXparser#resetConsoleOutput()
	 */
	public static String getConsoleOutput() {
		return CONSOLE_OUTPUT;
	}
	/**
	 * General mXparser expression help
	 *
	 * @return String with all general help content
	 */
	public static String getHelp() {
		synchronized (mXparserExp) {
			return mXparserExp.getHelp();
		}
	}
	/**
	 * General mXparser expression help - in-line key word searching
	 * @param   word    Key word to be searched
	 * @return  String with all help content
	 * lines containing given keyword
	 */
	public static String getHelp(String word) {
		synchronized (mXparserExp) {
			return mXparserExp.getHelp(word);
		}
	}
	/**
	 * Prints all help content.
	 */
	public static void consolePrintHelp() {
		System.out.println(getHelp());
	}
	/**
	 * Prints filtered help content.
	 * @param word      Key word.
	 */
	public static void consolePrintHelp(String word) {
		System.out.println(getHelp(word));
	}
	/**
	 * Returns list of key words known to the parser
	 *
	 * @return      List of keywords known to the parser.
	 *
	 * @see KeyWord
	 * @see KeyWord#wordTypeId
	 * @see mXparser#getHelp()
	 */
	public static List<KeyWord> getKeyWords() {
		synchronized (mXparserExp) {
			return mXparserExp.getKeyWords();
		}
	}
	/**
	 * Returns list of key words known to the parser
	 *
	 * @param query Give any string to filter list of key words against this string.
	 *              User more precise syntax: str=tokenString, desc=tokenDescription,
	 *              syn=TokenSyntax, sin=tokenSince, wid=wordId, tid=wordTypeId
	 *              to narrow the result.
	 *
	 * @return      List of keywords known to the parser filter against query string.
	 *
	 * @see KeyWord
	 * @see KeyWord#wordTypeId
	 * @see mXparser#getHelp(String)
	 */
	public static List<KeyWord> getKeyWords(String query) {
		synchronized (mXparserExp) {
			return mXparserExp.getKeyWords(query);
		}
	}
	/**
	 * Function used to introduce some compatibility
	 * between JAVA and C# while regexp matching.
	 *
	 * @param str         String
	 * @param pattern     Pattern (regexp)
	 *
	 * @return            True if pattern matches entirely, False otherwise
	 */
    public static boolean regexMatch(String str, String pattern){
        return Pattern.matches(pattern, str);
    }
    /**
     * Prints tokens to the console.
     * @param tokens   Tokens list.
     *
     * @see Expression#getCopyOfInitialTokens()
     * @see Token
     */
    public static void consolePrintTokens(List<Token> tokens) {
    	Expression.showTokens(tokens);
    }
	/**
	 * Prints tokens to the console.
	 * @param tokens   Tokens list.
	 *
	 * @see Expression#getCopyOfInitialTokens()
	 * @see Token
	 */
	public static void consolePrint(List<Token> tokens) {
		mXparser.consolePrintTokens(tokens);
	}
	/**
	 * Prints tokens to the console.
	 * @param tokens   Tokens list.
	 *
	 * @see Expression#getCopyOfInitialTokens()
	 * @see Token
	 */
	public static void consolePrintln(List<Token> tokens) {
		mXparser.consolePrintTokens(tokens);
		mXparser.consolePrintln();
	}
	/**
	 * The terms of MathParser.org-mXparser DUAL LICENSE AGREEMENT.
	 */
	public static final String LICENSE = License.MATHPARSERORG_MXPARSER_DUAL_LICENSE_AGREEMENT;
	/**
	 * Prints to the console the terms of MathParser.org-mXparser DUAL LICENSE AGREEMENT
	 */
	public static void consolePrintLicense() {
		License.consolePrintLicense();
	}
	/**
	 * Gets license info
	 *
	 * @return     license info as string
	 */
	public static String getLicense() {
		return LICENSE;
	}
	/**
	 * Waits given number of milliseconds
	 *
	 * @param n Number of milliseconds
	 */
	public static void wait (int n){
        long t0,t1;
        t0=System.currentTimeMillis();
        do{
            t1=System.currentTimeMillis();
        }
        while (t1-t0<n);
	}
	/**
	 * Method give a signal to other methods to cancel current calculation. This is a flag,
	 * remember to reset this flag after process is cancelled and you are going to start
	 * new calculation process.
	 */
	public static void cancelCurrentCalculation() {
		cancelCurrentCalculationFlag = true;
	}
	/**
	 * Resets a flag giving signal to the engine to cancel current calculation.
	 *
	 * {@link #cancelCurrentCalculation()}
	 */
	public static void resetCancelCurrentCalculationFlag() {
		cancelCurrentCalculationFlag = false;
	}
	/**
	 * Check whether a flag to cancel current calculation process is set.
	 *
	 * {@link #cancelCurrentCalculation()}
	 * {@link #resetCancelCurrentCalculationFlag()}
	 *
	 * @return true in case cancel calculation flag is active,
	 *        otherwise false
	 */
	public static boolean isCurrentCalculationCancelled() {
		return cancelCurrentCalculationFlag;
	}
	/*
	 * mXparser version names
	 */
	public static final String NAMEv10 = "1.0";
	public static final String NAMEv20 = "2.0";
	public static final String NAMEv23 = "2.3";
	public static final String NAMEv24 = "2.4";
	public static final String NAMEv30 = "3.0";
	public static final String NAMEv40 = "4.0";
	public static final String NAMEv41 = "4.1";
	public static final String NAMEv42 = "4.2";
	public static final String NAMEv43 = "4.3";
	public static final String NAMEv44 = "4.4";
	public static final String NAMEv50 = "5.0";
	public static final String NAMEv51 = "5.1";
}