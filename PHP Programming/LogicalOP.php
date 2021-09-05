<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
   <!-- html doctype -->
<h1>This is code of Logical Operators (&&,||) using if else in PHP</h1>
<?php

$a=1000;
$b=2001;
$c=200;

if(($a>$b)&&($a>$c))
    {
        echo "The a is Greater than  b and c";
    }
else if(($b>$a)&&($b>$c))
    {
        echo "The b is Greater than a and c";
    }
else if(($c>$a)&&($c>$b))
    {
        echo "The c is Greater than a and b";
    }

?>
</body>
</html>