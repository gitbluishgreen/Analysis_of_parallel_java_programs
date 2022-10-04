javac A1.java
for file in All_inputs/*.java
do	
	echo "=================="
	#echo "Testing $file"
	var=$(echo $file | cut --delimiter="/" --fields=2)
	name=$(echo $var | cut --delimiter="." --fields=1)
	java A1 <$file >op.txt
	diff -w op.txt Outputs/$name.txt && echo "$name.java Passed!" || echo "$name.txt Failed!"
done
