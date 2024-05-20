package Day14_20May;


    interface Speaker{
        public String say(String name);
    }

     class LambdaExpressionExample4 {
        public static void main(String[] args) {

            // Lambda expression with a single parameter.
            Speaker s1 = (name) -> {
                return "Hello, " + name;
            };

            System.out.println(s1.say("Guys"));

            // You can omit function parentheses

            Speaker s2 = name -> {
                return "Hello, " + name;
            };
            System.out.println(s2.say("Scaler"));

            // can omit the return statement and curly brackets,
            // because it has only one statement in the function body

            Speaker s3 = name ->"Hello, "+name;

            System.out.println(s3.say("Content"));

        }
    }