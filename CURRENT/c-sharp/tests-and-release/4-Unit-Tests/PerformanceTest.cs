/*
 * @(#)PerformanceTest.cs        5.0.4    2022-05-22
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
using System;
using System.Threading;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace org.mariuszgromada.math.mxparser.test {
	/**
	 * PerformanceTests - mXparser performance tests
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
	 * @version        5.0.0
	 *
	 * @see Expression
	 */
	[TestClass]
	public class PerformanceTests {
		/**
		 * Default number of iterations
		 */
		private const int BASE_ITER_NUM = 1000000;
		/**
		 * Performance test definition & result
		 */
		private static PerformanceTestResult[] tests;
		/**
		 * Creates threads, executes them, then wait till
		 * each thread is finished
		 *
		 * @param test         Test definition
		 * @param classId      Class id specifying the implementation of test scenario
		 */
		static void createRunJoinThreads(PerformanceTestResult test, int classId) {
			test.testInit();
			TestThread[] runners = new TestThread[test.threadsNum];
			#if !PCL && !NETSTANDARD1_0 && !NETSTANDARD1_1 && !NETSTANDARD1_2 && !NETSTANDARD1_3 && !NETSTANDARD1_4 && !NETSTANDARD1_5 && !NETSTANDARD1_6
				Thread[] threads = new Thread[test.threadsNum];
			#endif
			for (int threadId = 0; threadId < test.threadsNum; threadId++) {
				switch (classId) {
				case 0:  runners[threadId] = new TestSimpleCalcThread(test); break;
				case 1:  runners[threadId] = new TestSimpleCalcThread(test); break;
				case 2:  runners[threadId] = new TestSimpleCalcThread(test); break;
				case 3:  runners[threadId] = new TestSimpleCalcThread(test); break;
				case 4:  runners[threadId] = new TestSimpleCalcThread(test); break;
				case 5:  runners[threadId] = new TestSimpleCalcThread(test); break;
				case 6:  runners[threadId] = new TestSimpleCalcThread(test); break;
				case 7:  runners[threadId] = new TestSimpleCalcThread(test); break;
				case 8:  runners[threadId] = new TestSimpleCalcThread(test); break;
				case 9:  runners[threadId] = new TestSimpleCalcThread(test); break;
				case 10: runners[threadId] = new TestSimpleCalcThread(test); break;
				case 11: runners[threadId] = new Test011Thread(test); break;
				case 12: runners[threadId] = new Test012Thread(test); break;
				case 13: runners[threadId] = new Test013Thread(test); break;
				case 14: runners[threadId] = new Test014Thread(test); break;
				case 15: runners[threadId] = new Test015Thread(test); break;
				case 16: runners[threadId] = new Test016Thread(test); break;
				case 17: runners[threadId] = new Test017Thread(test); break;
				case 18: runners[threadId] = new Test018Thread(test); break;
				case 19: runners[threadId] = new Test019Thread(test); break;
				case 20: runners[threadId] = new Test020Thread(test); break;
				}
				#if PCL || NETSTANDARD1_0 || NETSTANDARD1_1 || NETSTANDARD1_2 || NETSTANDARD1_3 || NETSTANDARD1_4 || NETSTANDARD1_5 || NETSTANDARD1_6 || NETCOREAPP1_0 || NETCOREAPP1_1
					runners[threadId].run();
				#else
					threads[threadId] = new Thread(runners[threadId].run);
					threads[threadId].Start();
				#endif
			}
			#if !PCL && !NETSTANDARD1_0 && !NETSTANDARD1_1 && !NETSTANDARD1_2 && !NETSTANDARD1_3 && !NETSTANDARD1_4 && !NETSTANDARD1_5 && !NETSTANDARD1_6 && !NETCOREAPP1_0 && !NETCOREAPP1_1
				for (int threadId = 0; threadId < test.threadsNum; threadId++)
					try {
						threads[threadId].Join();
					} catch (ThreadInterruptedException e) {
						mXparser.consolePrintln(e.StackTrace);
					}
			#endif
			test.testClose();
		}
		/**
		 * Performance test: Simple calculations - addition.
		 * Expression created once. Iteration: repeatedly
		 * recalculated same expression.
		 *
		 * @param test
		 * @param testId
		 */
		static void test000(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Simple calculations - addition. Expression created once. Iteration: repeatedly recalculated same expression.";
			test.iterNum = BASE_ITER_NUM;
			test.exprStr = "2+3";
			createRunJoinThreads(test, 0);
		}
		/**
		 * Performance test: Simple calculations - multiplication.
		 * Expression created once. Iteration: repeatedly recalculated
		 * same expression.
		 *
		 * @param test
		 * @param testId
		 */
		static void test001(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Simple calculations - multiplication. Expression created once. Iteration: repeatedly recalculated same expression.";
			test.iterNum = BASE_ITER_NUM;
			test.exprStr = "2*3";
			createRunJoinThreads(test, 1);
		}
		/**
		 * Performance test: Simple calculations - division. Expression
		 * created once. Iteration: repeatedly recalculated same
		 * expression.
		 *
		 * @param test
		 * @param testId
		 */
		static void test002(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Simple calculations - division. Expression created once. Iteration: repeatedly recalculated same expression.";
			test.iterNum = BASE_ITER_NUM;
			test.exprStr = "2/3";
			createRunJoinThreads(test, 2);
		}
		/**
		 * Performance test: Simple calculations - power. Expression
		 * created once. Iteration: repeatedly recalculated same
		 * expression.
		 *
		 * @param test
		 * @param testId
		 */
		static void test003(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Simple calculations - power. Expression created once. Iteration: repeatedly recalculated same expression.";
			test.iterNum = BASE_ITER_NUM;
			test.exprStr = "2^3";
			createRunJoinThreads(test, 3);
		}
		/**
		 * Performance test: Simple calculations - sinus. Expression
		 * created once. Iteration: repeatedly recalculated same
		 * expression.
		 *
		 * @param test
		 * @param testId
		 */
		static void test004(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Simple calculations - sinus. Expression created once. Iteration: repeatedly recalculated same expression.";
			test.iterNum = BASE_ITER_NUM;
			test.exprStr = "sin(3)";
			createRunJoinThreads(test, 4);
		}
		/**
		 * Performance test: Simple calculations - 2 additions.
		 * Expression created once. Iteration: repeatedly recalculated
		 * same expression.
		 *
		 * @param test
		 * @param testId
		 */
		static void test005(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Simple calculations - 2 additions. Expression created once. Iteration: repeatedly recalculated same expression.";
			test.iterNum = BASE_ITER_NUM;
			test.exprStr = "2+3+4";
			createRunJoinThreads(test, 5);
		}
		/**
		 * Performance test: Simple calculations - 3 additions.
		 * Expression created once. Iteration: repeatedly
		 * recalculated same expression.
		 *
		 * @param test
		 * @param testId
		 */
		static void test006(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Simple calculations - 3 additions. Expression created once. Iteration: repeatedly recalculated same expression.";
			test.iterNum = BASE_ITER_NUM;
			test.exprStr = "2+3+4+5";
			createRunJoinThreads(test, 6);
		}
		/**
		 * Performance test: Simple calculations - 3 additions +
		 * 1 parenthesis. Expression created once. Iteration:
		 * repeatedly recalculated same expression.
		 *
		 * @param test
		 * @param testId
		 */
		static void test007(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Simple calculations - 3 additions + 1 parenthesis. Expression created once. Iteration: repeatedly recalculated same expression.";
			test.iterNum = BASE_ITER_NUM;
			test.exprStr = "2+(3+4)+5";
			createRunJoinThreads(test, 7);
		}
		/**
		 * Performance test: Simple calculations - 3 additions +
		 * 2 brackets. Expression created once. Iteration:
		 * repeatedly recalculated same expression.
		 *
		 * @param test
		 * @param testId
		 */
		static void test008(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Simple calculations - 3 additions + 2 brackets. Expression created once. Iteration: repeatedly recalculated same expression.";
			test.iterNum = BASE_ITER_NUM;
			test.exprStr = "(2+3)+(4+5)";
			createRunJoinThreads(test, 8);
		}
		/**
		 * Performance test: Simple calculations - 3 additions + 2
		 * brackets. Expression created once. Iteration:
		 * repeatedly recalculated same expression.
		 *
		 * @param test
		 * @param testId
		 */
		static void test009(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Simple calculations - 3 additions + 2 brackets. Expression created once. Iteration: repeatedly recalculated same expression.";
			test.iterNum = BASE_ITER_NUM;
			test.exprStr = "2+(3+(4+5))";
			createRunJoinThreads(test, 9);
		}
		/**
		 * Performance test: Combination of different operations.
		 * Expression created once. Iteration: repeatedly
		 * recalculated same expression.
		 *
		 * @param test
		 * @param testId
		 */
		static void test010(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Combination of different operations. Expression created once. Iteration: repeatedly recalculated same expression.";
			test.iterNum = BASE_ITER_NUM;
			test.exprStr = "sin(2+(3*4)^2)/10";
			createRunJoinThreads(test, 10);
		}
		/**
		 * Performance test: Simple calculations - addition with
		 * argument. Expression created once, containing argument
		 * 'x'. Iteration: argument value is being modified
		 * (increased), then expression is recalculated
		 *
		 * @param test
		 * @param testId
		 */
		static void test011(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Simple calculations - addition with argument. Expression created once, containing argument 'x'. Iteration: argument value is being modified (increased), then expression is recalculated";
			test.iterNum = BASE_ITER_NUM;
			test.exprStr = "2+x";
			createRunJoinThreads(test, 11);
		}
		/**
		 * Performance test: User defined function f(x,y)=3x+4y.
		 * Expression &Function created once, containing argument 'x'.
		 * Iteration: argument value is being modified (increased),
		 * then expression is recalculated
		 *
		 * @param test
		 * @param testId
		 */
		static void test012(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "User defined function f(x,y)=3*x+4*y. Expression &Function created once, containing argument 'x'. Iteration: argument value is being modified (increased), then expression is recalculated";
			test.iterNum = BASE_ITER_NUM / 10;
			test.exprStr = "3*f(x,y)-(2*x+3*y)";
			createRunJoinThreads(test, 12);
		}
		/**
		 * Performance test: Creating constants: Iteration:
		 * Constant c = new Constant("c", 5)
		 *
		 * @param test
		 * @param testId
		 */
		static void test013(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Creating constants: Iteration: Constant c = new Constant(\"c\", 5)";
			test.iterNum = BASE_ITER_NUM / 20;
			test.exprStr = "Constant c = new Constant(\"c\", 5)";
			createRunJoinThreads(test, 13);
		}
		/**
		 * Performance test: Creating constants: Iteration:
		 * Constant c = new Constant("c=5")
		 *
		 * @param test
		 * @param testId
		 */
		static void test014(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Creating constants: Iteration: Constant c = new Constant(\"c=5\")";
			test.iterNum = BASE_ITER_NUM / 200;
			test.exprStr = "Constant c = new Constant(\"c=5\")";
			createRunJoinThreads(test, 14);
		}
		/**
		 * Performance test: Creating arguments: Iteration:
		 * Argument x = new Argument("x", 5)
		 *
		 * @param test
		 * @param testId
		 */
		static void test015(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Creating arguments: Iteration: Argument x = new Argument(\"x\", 5)";
			test.iterNum = BASE_ITER_NUM / 20;
			test.exprStr = "Argument x = new Argument(\"x\", 5)";
			createRunJoinThreads(test, 15);
		}
		/**
		 * Performance test: Creating arguments: Iteration:
		 * Argument x = new Argument("x", 5)
		 *
		 * @param test
		 * @param testId
		 */
		static void test016(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Creating arguments: Iteration: Argument x = new Argument(\"x=5\")";
			test.iterNum = BASE_ITER_NUM / 200;
			test.exprStr = "Argument x = new Argument(\"x=5\")";
			createRunJoinThreads(test, 16);
		}
		/**
		 * Performance test: Creating functions: Iteration:
		 * Function f = new Function("f", "x+y", "x", "y")
		 *
		 * @param test
		 * @param testId
		 */
		static void test017(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Creating functions: Iteration: Function f = new Function(\"f\", \"x+y\", \"x\", \"y\")";
			test.iterNum = BASE_ITER_NUM / 20;
			test.exprStr = "Function f = new Function(\"f\", \"x+y\", \"x\", \"y\")";
			createRunJoinThreads(test, 17);
		}
		/**
		 * Performance test: Creating functions: Iteration:
		 * Function f = new Function("f(x,y)=x+y")
		 *
		 * @param test
		 * @param testId
		 */
		static void test018(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Creating functions: Iteration: Function f = new Function(\"f(x,y)=x+y\")";
			test.iterNum = BASE_ITER_NUM / 200;
			test.exprStr = "Function f = new Function(\"f(x,y)=x+y\")";
			createRunJoinThreads(test, 18);
		}
		/**
		 * Performance test: Creating expressions: Iteration:
		 * Expression e = new Expression("sin(2+(3*4)^2)/10")
		 *
		 * @param test
		 * @param testId
		 */
		static void test019(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Creating expressions: Iteration: Expression e = new Expression(\"sin(2+(3*4)^2)/10\")";
			test.iterNum = BASE_ITER_NUM / 20;
			test.exprStr = "Expression e = new Expression(\"sin(2+(3*4)^2)/10\")";
			createRunJoinThreads(test, 19);
		}
		/**
		 * Performance test: Creating expressions + checking syntax:
		 * Iteration:
		 * Expression e = new Expression("sin(2+(3*4)^2)/10")
		 *
		 * @param test
		 * @param testId
		 */
		static void test020(PerformanceTestResult test, int testId) {
			test.Id = testId;
			test.description = "Creating expressions + checking syntax: Iteration: Expression e = new Expression(\"sin(2+(3*4)^2)/10\")";
			test.iterNum = BASE_ITER_NUM / 100;
			test.exprStr = "Expression e = new Expression(\"sin(2+(3*4)^2)/10\")";
			createRunJoinThreads(test, 20);
		}
		/**
		 * Starts mXparser performance tests. List of performed tests:
		 *
		 * <ul>
		 * <li>00. Simple calculations - addition. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>01. Simple calculations - multiplication. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>02. Simple calculations - division. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>03. Simple calculations - power. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>04. Simple calculations - sinus. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>05. Simple calculations - 2 additions. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>06. Simple calculations - 3 additions. Expression created once. Iteration: repeatedlyrecalculated same expression.
		 * <li>07. Simple calculations - 3 additions + 1 parenthesis. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>08. Simple calculations - 3 additions + 2 brackets. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>09. Simple calculations - 3 additions + 2 brackets. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>10. Combination of different operations. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>11. Simple calculations - addition with argument. Expression created once, containing argument 'x'. Iteration: argument value is being modified (increased), then expression is recalculated
		 * <li>12. User defined function f(x,y)=3x+4y. Expression &Function created once, containing argument 'x'. Iteration: argument value is being modified (increased), then expression is recalculated
		 * <li>13. Creating constants: Iteration: Constant c = new Constant("c", 5)
		 * <li>14. Creating constants: Iteration: Constant c = new Constant("c=5")
		 * <li>15. Creating arguments: Iteration: Argument x = new Argument("x", 5)
		 * <li>16. Creating arguments: Iteration: Argument x = new Argument("x=5")
		 * <li>17. Creating functions: Iteration: Function f = new Function("f", "x+y", "x", "y")
		 * <li>18. Creating functions: Iteration: Function f = new Function("f(x,y)=x+y")
		 * <li>19. Creating expressions: Iteration: Expression e = new Expression("sin(2+(3*4)^2)/10")
		 * <li>20. Creating expressions + checking syntax: Iteration: Expression e = new Expression("sin(2+(3*4)^2)/10")
		 * </ul>
		 *
		 * @param  threadsNum   Number of threads
		 * @return Number of tests that were not performed.
		 */
		public static int startPerformanceTests(int threadsNum) {
			mXparser.disableUlpRounding();
			mXparser.disableAlmostIntRounding();
			mXparser.disableCanonicalRounding();
			if (threadsNum <= 0) threadsNum = mXparser.getThreadsNumber();
			tests = new PerformanceTestResult[21];
			int testId = -1;
			int lastTestId = 20;
			tests[++testId] = new PerformanceTestResult(threadsNum); test000(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test001(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test002(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test003(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test004(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test005(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test006(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test007(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test008(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test009(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test010(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test011(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test012(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test013(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test014(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test015(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test016(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test017(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test018(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test019(tests[testId], testId);
			tests[++testId] = new PerformanceTestResult(threadsNum); test020(tests[testId], testId);
			return lastTestId - testId;
		}
		/**
		 * Starts mXparser performance tests - number of threads given by the
		 * mXparser.getThreadsNumber()
		 *
		 * List of performed tests:
		 *
		 * <ul>
		 * <li>00. Simple calculations - addition. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>01. Simple calculations - multiplication. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>02. Simple calculations - division. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>03. Simple calculations - power. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>04. Simple calculations - sinus. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>05. Simple calculations - 2 additions. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>06. Simple calculations - 3 additions. Expression created once. Iteration: repeatedlyrecalculated same expression.
		 * <li>07. Simple calculations - 3 additions + 1 parenthesis. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>08. Simple calculations - 3 additions + 2 brackets. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>09. Simple calculations - 3 additions + 2 brackets. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>10. Combination of different operations. Expression created once. Iteration: repeatedly recalculated same expression.
		 * <li>11. Simple calculations - addition with argument. Expression created once, containing argument 'x'. Iteration: argument value is being modified (increased), then expression is recalculated
		 * <li>12. User defined function f(x,y)=3x+4y. Expression &Function created once, containing argument 'x'. Iteration: argument value is being modified (increased), then expression is recalculated
		 * <li>13. Creating constants: Iteration: Constant c = new Constant("c", 5)
		 * <li>14. Creating constants: Iteration: Constant c = new Constant("c=5")
		 * <li>15. Creating arguments: Iteration: Argument x = new Argument("x", 5)
		 * <li>16. Creating arguments: Iteration: Argument x = new Argument("x=5")
		 * <li>17. Creating functions: Iteration: Function f = new Function("f", "x+y", "x", "y")
		 * <li>18. Creating functions: Iteration: Function f = new Function("f(x,y)=x+y")
		 * <li>19. Creating expressions: Iteration: Expression e = new Expression("sin(2+(3*4)^2)/10")
		 * <li>20. Creating expressions + checking syntax: Iteration: Expression e = new Expression("sin(2+(3*4)^2)/10")
		 * </ul>
		 *
		 * @see mXparser.#getThreadsNumber()
		 * @see mXparser.#setThreadsNumber(int)
		 *
		 * @return Number of tests that were not performed.
		 */
		[TestMethod]
		public void testPerformance() {
			startPerformanceTests(mXparser.getThreadsNumber());
			bool testResult = true;
			if (tests != null) {
				foreach (PerformanceTestResult ptr in tests)
					if (!ptr.isClosed) {
						testResult = false;
						mXparser.consolePrintln("test = " + ptr.Id + "isClosed = " + ptr.isClosed);
						break;
					}
			}
			else {
				mXparser.consolePrintln("tests == null");
				testResult = false;
			}
			Assert.IsTrue(testResult);
		}
	}
	/**
	 * Package level class to keep
	 * performance test result/
	 */
	class PerformanceTestResult {
		internal long startTime;
		internal long endTime;
		internal int iterNum;
		internal double computingTimeSec;
		internal long iterPerSec;
		internal int Id;
		internal int threadsNum;
		internal String description;
		internal String exprStr;
		internal bool isClosed = false;
		internal PerformanceTestResult(int threadsNum) {
			this.threadsNum = threadsNum;
		}
		internal void testInit() {
			startTime = mXparser.currentTimeMillis();
		}
		internal void testClose() {
			endTime = mXparser.currentTimeMillis();
			computingTimeSec = (endTime - startTime)/1000.0;
			iterPerSec = (long)Math.Round(iterNum / computingTimeSec);
			isClosed = true;
			mXparser.consolePrintln("(threads = " + threadsNum + ") test - " + Id + "; " + exprStr + "; " + iterPerSec + "; " + computingTimeSec + "; " + iterNum + "; " + description);
		}
	}
	/**
	 * Multithreading abstract implementation of test
	 */
	abstract class TestThread {
		/**
		 * Number of iterations for a single thread.
		 */
		protected int iterNum;
		/**
		 * Test parameters.
		 */
		protected PerformanceTestResult test;
		/**
		 * Default constructor - creates parameters
		 * for a single test thread
		 *
		 * @param test         Test parameters
		 * @param threadsNum   Number of threads
		 */
		internal TestThread(PerformanceTestResult test) {
			this.test = test;
			this.iterNum = test.iterNum/test.threadsNum;
		}
		/**
		 * Test scenario implementation
		 */
		protected abstract void testScenario();
		/**
		 * Test scenario execution
		 */
		public void run () {
			testScenario();
		}
	}
	/**
	 * Multithreading implementation of class for
	 * Performance test: Simple calculations
	 */
	class TestSimpleCalcThread : TestThread {
		internal TestSimpleCalcThread(PerformanceTestResult test) : base(test) { }
		protected override void testScenario() {
			Expression e = new Expression(test.exprStr);
			for (int i = 0; i <= base.iterNum; i++) {
				if (mXparser.isCurrentCalculationCancelled()) break;
				e.calculate();
			}
		}
	}
	/**
	 * Multithreading implementation of class for
	 * Performance test: Simple calculations - addition with
	 * argument. Expression created once, containing argument
	 * 'x'. Iteration: argument value is being modified
	 * (increased), then expression is recalculated
	 */
	class Test011Thread : TestThread {
		internal Test011Thread(PerformanceTestResult test) : base(test) { }
		protected override void testScenario() {
			Argument x = new Argument("x");
			Expression e = new Expression(test.exprStr, x);
			for (int i = 0; i <= base.iterNum; i++) {
				if (mXparser.isCurrentCalculationCancelled()) break;
				x.setArgumentValue(i);
				e.calculate();
			}
		}
	}
	/**
	 * Multithreading implementation of class for
	 * Performance test: User defined function f(x,y)=3x+4y.
	 * Expression &Function created once, containing argument 'x'.
	 * Iteration: argument value is being modified (increased),
	 * then expression is recalculated
	 */
	class Test012Thread : TestThread {
		internal Test012Thread(PerformanceTestResult test) : base(test) { }
		protected override void testScenario() {
			Argument x = new Argument("x");
			Argument y = new Argument("y");
			Function f = new Function("f(x,y)=3*x+4*y");
			Expression e = new Expression(test.exprStr, f, x, y);
			for (int i = 0; i <= base.iterNum; i++) {
				if (mXparser.isCurrentCalculationCancelled()) break;
				x.setArgumentValue(i);
				y.setArgumentValue(i);
				e.calculate();
			}
		}
	}
	/**
	 * Multithreading implementation of class for
	 * Performance test: Creating constants: Iteration:
	 * Constant c = new Constant("c", 5)
	 */
	class Test013Thread : TestThread {
		internal Test013Thread(PerformanceTestResult test) : base(test) { }
		protected override void testScenario() {
			Constant c = new Constant("c", 5);
			for (int i = 0; i <= base.iterNum; i++) {
				if (mXparser.isCurrentCalculationCancelled()) break;
				c = new Constant("c", 5);
			}
			c.getConstantValue();
		}
	}
	/**
	 * Multithreading implementation of class for
	 * Performance test: Creating constants: Iteration:
	 * Constant c = new Constant("c=5")
	 */
	class Test014Thread : TestThread {
		internal Test014Thread(PerformanceTestResult test) : base(test) { }
		protected override void testScenario() {
			Constant c = new Constant("c", 5);
			for (int i = 0; i <= base.iterNum; i++) {
				if (mXparser.isCurrentCalculationCancelled()) break;
				c = new Constant("c=5");
			}
			c.getConstantValue();
		}
	}
	/**
	 * Multithreading implementation of class for
	 * Performance test: Creating arguments: Iteration:
	 * Argument x = new Argument("x", 5)
	 */
	class Test015Thread : TestThread {
		internal Test015Thread(PerformanceTestResult test) : base(test) { }
		protected override void testScenario() {
			Argument x = new Argument("x", 2);
			for (int i = 0; i <= base.iterNum; i++) {
				if (mXparser.isCurrentCalculationCancelled()) break;
				x = new Argument("x", 5);
			}
			x.getArgumentValue();
		}
	}
	/**
	 * Multithreading implementation of class for
	 * Performance test: Creating arguments: Iteration:
	 * Argument x = new Argument("x = 5")
	 */
	class Test016Thread : TestThread {
		internal Test016Thread(PerformanceTestResult test) : base(test) { }
		protected override void testScenario() {
			Argument x = new Argument("x", 2);
			for (int i = 0; i <= base.iterNum; i++) {
				if (mXparser.isCurrentCalculationCancelled()) break;
				x = new Argument("x=5");
			}
			x.getArgumentValue();
		}
	}
	/**
	 * Multithreading implementation of class for
	 * Performance test: Creating functions: Iteration:
	 * Function f = new Function("f", "x+y", "x", "y")
	 */
	class Test017Thread : TestThread {
		internal Test017Thread(PerformanceTestResult test) : base(test) { }
		protected override void testScenario() {
			Function f = new Function("f", "x", "x");
			for (int i = 0; i <= base.iterNum; i++) {
				if (mXparser.isCurrentCalculationCancelled()) break;
				f = new Function("f", "x+y", "x", "y");
			}
			f.calculate(1);
		}
	}
	/**
	 * Multithreading implementation of class for
	 * Performance test: Creating functions: Iteration:
	 * Function f = new Function("f(x,y)=x+y")
	 */
	class Test018Thread : TestThread {
		internal Test018Thread(PerformanceTestResult test) : base(test) { }
		protected override void testScenario() {
			Function f = new Function("f", "x", "x");
			for (int i = 0; i <= base.iterNum; i++) {
				if (mXparser.isCurrentCalculationCancelled()) break;
				f = new Function("f(x,y)=x+y");
			}
			f.calculate(1, 2);
		}
	}
	/**
	 * Multithreading implementation of class for
	 * Performance test: Creating expressions: Iteration:
	 * Expression e = new Expression("sin(2+(3*4)^2)/10")
	 */
	class Test019Thread : TestThread {
		internal Test019Thread(PerformanceTestResult test) : base(test) { }
		protected override void testScenario() {
			Expression e = new Expression("");
			for (int i = 0; i <= base.iterNum; i++) {
				if (mXparser.isCurrentCalculationCancelled()) break;
				e = new Expression("sin(2+(3*4)^2)/10");
			}
			e.calculate();
		}
	}
	/**
	 * Multithreading implementation of class for
	 * Performance test: Creating expressions:
	 * Expression e = new Expression("")
	 * Iteration:
	 * e.setExpressionString(sin(2+(3*4)^2)/10);
	 * e.checkSyntax();
	 */
	class Test020Thread : TestThread {
		internal Test020Thread(PerformanceTestResult test) : base(test) { }
		protected override void testScenario() {
			Expression e = new Expression("");
			for (int i = 0; i <= base.iterNum; i++) {
				if (mXparser.isCurrentCalculationCancelled()) break;
				e.setExpressionString("sin(2+(3*4)^2)/10");
				e.checkSyntax();
			}
		}
	}
}