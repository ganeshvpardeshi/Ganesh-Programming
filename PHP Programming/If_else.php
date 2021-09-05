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
<h1>This code of If Else in PHP</h1>
<?php

$a=1000;
$b=201;
$c=200;
if($a>$b)
    {
        echo " the a is greater than b";
    }
else if ($b>$c)
    {
        echo " the b is greater than c";
    }
else if($c>$a)
    {
        echo "the c is greater than a";
    }
else    
    {
        echo "all values are equal";
    }

?>
</body>
</html>