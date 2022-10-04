javac A2.java
#mkdir Tests/new_outputs
if [[ ! -d Tests/predicted_outputs ]]
then
mkdir Tests/predicted_outputs
fi
for file in inputs_allLabels/*.java
do	
	echo "=================="
	var=$(echo $file | cut --delimiter="/" --fields=2)
	var1=$(echo $var| cut --delimiter="." --fields=1)
	java A2 <$file >op.txt
	diff -w Aslesh_Output_AllLabels/$var1.txt op.txt && echo "$var1.java Passed!" || echo "$var1.java Failed!"
done
#rm -rf Tests/predicted_outputs
