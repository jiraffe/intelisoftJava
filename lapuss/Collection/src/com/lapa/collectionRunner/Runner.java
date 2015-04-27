package com.lapa.collectionRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Runner {
	public static void main(String[] args) {
		List<Integer> integerInt = new ArrayList<>();
		for (int i=1;i<21;i++){
			integerInt.add(i*2);
		}
		int b = integerInt.size();
		for (int i=1;i<(b+21);i++){
			integerInt.add(i);
		}
		
		integerInt.set(3, 9);
		System.out.println(integerInt.get(3));
		integerInt.remove(1);
		int a = integerInt.size();
		for (int i =1; i<a; i++)
			System.out.print(integerInt.get(i)+"  ");
 	
	Set<Integer> hashSetInteger = new HashSet<>();
	for (int i=1;i<10;i++){
		hashSetInteger.add(i);
	}
	for (int i =5;i<15;i++ ){
		hashSetInteger.add(i);
		
	}
		System.out.println();
		System.out.println(hashSetInteger.size());
		Iterator t = hashSetInteger.iterator();
		while (t.hasNext()) {
			System.out.println(t.next());
		}
		
		String pesn = "Калинка калинка калинка моя В саду ягода малинка малинка моя Ах Под сосною под зеленою Спать положите вы меня; Ай люли люли ай люли люли Спать положите вы меня Калинка калинка калинка моя В саду ягода малинка малинка моя Ах Сосенушка ты зеленая Не шуми же надо мной Ай люли люли ай люли люли Не шуми же надо мной Калинка калинка калинка моя В саду ягода малинка малинка моя Ах Красавица душа-девица Полюби же ты меня Ай люли люли ай люли люли Полюби же ты меня Калинка калинка калинка моя В саду ягода малинка малинка моя";
		String[]s =pesn.split(" ");
		Map <String, Integer> hashMap = new HashMap<String, Integer>();
		int v = s.length;
		for (int i=0;i<v;i++){
						
			if( ! hashMap.containsKey(s[i])){
				
				hashMap.put(s[i], 1);
			} else {
				int valu = hashMap.get(s[i]);
				hashMap.put(s[i], ++valu);
			}
		}
		Iterator m = hashMap.keySet().iterator();
		
}
}