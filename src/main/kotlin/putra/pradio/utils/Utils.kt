package putra.pradio.utils

class Utils {
    companion object {
        fun isPrime(n: Int): Boolean {
            if (n <= 1) return false
            if (n <= 3) return true
            if (n % 2 == 0 || n % 3 == 0) return false
            var i = 5
            while (i * i <= n) {
                if (n % i == 0 || n % (i + 2) == 0) return false
                i += 6
            }
            return true
        }

        fun nextFibonacci(n: Int): Int {
            if (n <= 0) return 0
            if (n == 1 || n == 2) return 1
            var a = 1
            var b = 1
            var result = 0
            for (i in 3..n) {
                result = a + b
                a = b
                b = result
            }
            return result
        }
    }
}