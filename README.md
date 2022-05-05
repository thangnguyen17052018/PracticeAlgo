# Jazzy Spell Checker 

## How to use:

#### You can include dependency in to pom.xml of your Maven project: [Jazzy Repo](https://mvnrepository.com/artifact/net.sf.jazzy/jazzy-core/0.5.2)

```xml
<groupId>net.sf.jazzy</groupId>
<artifactId>jazzy-core</artifactId>
<version>0.5.2</version>
```
### Or you can build Ant from the project and add its target jars as library to your project:
[Project Github](https://github.com/reckart/jazzy)


## Implement instructions:
  
  #### For this assignment (I used in PermutationOfSequenceCharacter), we only need jazzy-core-0.5.2.jar as the library need to implement your own Spell Checker.
  ![feature-image](https://raw.githubusercontent.com/thangnguyen17052018/PracticeAlgo/master/src/main/resources/images/Screenshot%20from%202022-05-05%2011-32-33.png)
  
  #### First: We need a dictionary data for the SpellChecker will lookup from it for performing spell checking.
  ##### You can get it from this folder: [Dictionary Folder](https://github.com/reckart/jazzy/tree/master/dict/). In this project I use _english.0_ as words list.
  
  #### To implements: You can create your own spell checker with your needs which implements SpellCheckListener.
  ##### For example:
  ![feature-image](https://raw.githubusercontent.com/thangnguyen17052018/PracticeAlgo/master/src/main/resources/images/Screenshot%20from%202022-05-05%2011-43-16.png)
  ##### In my example:
  ###### SpellDictionary: used to get data from dictionary file and map it in a HashTable.
  ###### SpellChecker: initialize with the SpellDictionary, used to perform many word check operations, check spelling, add word to dictionary, ...
  ###### Because your own Spell Checker implements SpellCheckListener so you need to addSpellCheckListener as this class. When the word is misplelling, it will call the spellingError(). You also get the suggestions for invalid word which was mispelt from the event.
  
  ##### Apply to my assignment:
  ![feature-image](https://raw.githubusercontent.com/thangnguyen17052018/PracticeAlgo/master/src/main/resources/images/Screenshot%20from%202022-05-05%2011-57-40.png)
  
  ###### The case checkSpelling correct it will return (-1). So that I need to check for selection the Spelt word in all of permutations.
  
  ##### Another example available in the github project you can reference for more discovering:  [Other Example](https://github.com/reckart/jazzy/blob/master/src/com/swabunga/spell/examples/SpellCheckExample2.java)
  
  ##### In my opinion this you can also use this API for check the spelling error in your text and replace it with the valid word.
