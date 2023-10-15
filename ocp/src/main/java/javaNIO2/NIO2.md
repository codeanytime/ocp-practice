# #NIO2
![markdown](Screen Shot 2023-10-13 at 19.56.05.png)
1. **Path = Paths.get()**;
***
![markdown](Screen Shot 2023-10-13 at 19.59.33.png)
***
#Loai bo director/. .. du thua khoi path
Vi du: 
* Paths.get("/lizard/./").resolve(Paths.get("walking.txt"));
   * -> /lizard/walking.txt
* Path path2 = new File("/lizard/././actions/../walking.txt").toPath()
   * Loai bo actions/.. va . du thua -> /lizard/walking.txt 
* resolve:
   * ####Absolute path (bat dau = "/" - co duong dan goc): 
     * ####path1.resolve(path2) = path2#
   * ####Khong co duong dan goc: = path1 + path2
#Review questions
1. F
2. A,B,C,D -> **B,C**
3. A -> **D**
4. C
5. Not answer -> **B,C,D**
6. Not answer -> **C**
7. Not answer -> **E**
8. Not answer -> **A**
9. A,B,C -> **B,C**
10. Not answer -> **C,E**
11. Not answer -> **A**
12. A,F,G
13. A -> **B**
14. E
15. A,C,E,F -> **D,E,F**
16. F
17. G -> **A,G**
18. Not answer -> **D**
19. A,C,E
20. A -> **B**