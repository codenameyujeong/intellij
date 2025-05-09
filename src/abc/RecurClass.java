//재귀호출(순환함수(recursive) = 되부름 함수)
package abc;
class RecurClass {
	public static void main(String args[])
	{
		System.out.println(factorial(4));
	}

	static long factorial(int n) {
		long result=0;

		if ( n == 1) {
			result = 1;
		} else {
			// 자신의 메소드를 재호출(되부름)
			result = n * factorial(n-1);
		}

		return result;
	}
}