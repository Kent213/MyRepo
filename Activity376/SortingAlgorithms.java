package Activity376;
import java.util.ArrayList;

public class SortingAlgorithms
{
  /**
   * Perform a selection sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList)
  {
    
    for (int i = 0; i < intList.size() - 1; i++)
    {

      int minIndex = i;
      for (int searchIndex = i + 1; searchIndex < intList.size(); searchIndex++)
      {
        if(intList.get(searchIndex) < intList.get(minIndex))
          minIndex = searchIndex;
      }
      int temp = intList.get(i);
      int smallest = intList.get(minIndex);
      intList.set(i, smallest);
      intList.set(minIndex, temp);
    }
    return intList;
  }

  /**
   * Perform an insertion sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList)
  {
    for (int i = 1; i < intList.size(); i++) 
    {
      int valueToSort = intList.get(i); 
      int prevIndex = i - 1; 
      while (prevIndex >= 0)  
      {
        int sortedValue = intList.get(prevIndex);
        if (sortedValue > valueToSort) 
        {
          intList.set(prevIndex + 1, sortedValue);
          intList.set(prevIndex, valueToSort); 
        }
        prevIndex--;
      }
    }
    return intList;
  }

  /**
   * Perform a selection sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */ 
  public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList)
  {
    for (int i = 0; i < doubleList.size() - 1; i++)
    {
      int minIndex = i;
      for (int searchIndex = i + 1; searchIndex < doubleList.size(); searchIndex++)
      {
        if(doubleList.get(searchIndex) < doubleList.get(minIndex))
          minIndex = searchIndex;
      }
      double temp = doubleList.get(i);
      double smallest = doubleList.get(minIndex);

      doubleList.set(i, smallest);
      doubleList.set(minIndex, temp);
    }
    return doubleList;
  }

  /**
   * Perform an insertion sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */
  public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList)
  {
    for (int i = 1; i < doubleList.size(); i++) 
    {
      
      double valueToSort = doubleList.get(i); 
      int prevIndex = i - 1; 
      
      while (prevIndex >= 0)  
      {
        double sortedValue = doubleList.get(prevIndex);
        
        if (sortedValue > valueToSort) 
        {
          doubleList.set(prevIndex + 1, sortedValue);
          doubleList.set(prevIndex, valueToSort); 
        }
        prevIndex--;
      }
    }
    return doubleList;
  }

}