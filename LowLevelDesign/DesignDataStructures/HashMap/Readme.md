<h2> Implementing HashMap </h2>

From JDK8, HashMap uses <b> Balanceed Binary Tree </b> for Handling Collision Instead of Linked List after
Threshold of 8 Values. (This will Reduce Search from O(N) to O(logN) if many keys are stored at Same Index)

* HashMap Can Contain Null Keys, (Hash Code would be zero, Hence Index would be 0).
* If a Key already Exists in HashMap, the value is replaced with new Value.

<h4> HashCode Calculation in JDK </h4>
In Java, the hashCode() method is a method of the Object class, which is a superclass for all objects in Java. When you use this method, you typically call it on an object, such as a key in a HashMap, to get a 32-bit signed integer (int) that represents the value of that object.

If the default implementation of hashCode() in the Object class is not overridden in a custom class, it returns a unique integer based on the memory address of the object. This means that each object will have a unique hash code by default.

```
public int hashCode(){
    return Objects.hashCode(key) ^ Objects.hashCode(value);
}
```

<h4> Hash Value Calculation in JDK </h4>

```
int h;
return (key == null) ? 0 : (h = key.hashCode()) ^ (h>>>16);
```

<h4> My HashMap vs JDK HashMap</h4>

* JDK Stores Hash Along with Node.

<h3> Load Factor & Resizing </h3>

* If HashTable size is filled greater than loadfactor, Hash Table needs to be resized (Increase). Generally Load Factor would be 75%.

<h3> Difference Between HashMaps vs HashTable </h3>

![Differences](../Images/Differences.png)

<h2> Points for Interview </h2>

* HashMap Represents HashTable DataStructure.
* An Object Should Implement HashCode and Equlas() Method to be used as Key or Value in HashMap.
* Default Capacity for HashMap is 16, If nothing is Specified.

<h2> USeful Resources </h2>

* HashMap Implementation Theory : https://www.youtube.com/watch?v=SXfsBDTodpY
* HashMap Implementation Code : https://www.youtube.com/watch?v=AsAymWn7D40