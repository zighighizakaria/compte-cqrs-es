# TP 3 CQRS BANKING ZIGHIGHI GLSID 3
Create project

------------
![Screenshot_8.png](screens%2FScreenshot_8.png)
**Adding dependencies**
![Screenshot_1.png](screens%2FScreenshot_1.png)
**adding axon**
![Screenshot_2.png](screens%2FScreenshot_2.png)

--------------

**TEST 1 (Adding to mysql):** 

![Screenshot_3.png](screens%2FScreenshot_3.png)

----------------
**TEST POSTMAN**
![l.png](screens%2Fl.png)
 
**Apres ajouter CommandHandler et EventsourcingHandler**

![Screenshot_4.png](screens%2FScreenshot_4.png)

![Screenshot_5.png](screens%2FScreenshot_5.png)

**VERIFIER LA BDD**
![Screenshot_6.png](screens%2FScreenshot_6.png)

**Using eventStore.readEvents**

![Screenshot_7.png](screens%2FScreenshot_7.png)

---------------

**Activer Un compte aprés sa création** 

![Screenshot_9.png](screens%2FScreenshot_9.png)

-------------------

**Crediter un compte** 
TESTER AVEC NEGATIVE VALUE
![Screenshot_10.png](screens%2FScreenshot_10.png)
TESTER AVEC UNE VALEUR JUSTE
![Screenshot_11.png](screens%2FScreenshot_11.png)

Verifier eventstore

![Screenshot_12.png](screens%2FScreenshot_12.png)

-------------

**debiter un compte** 

TESTER AVEC NEGATIVE VALUE
![Screenshot_13.png](screens%2FScreenshot_13.png)
TESTER AVEC UNE VALEUR JUSTE
![Screenshot_14.png](screens%2FScreenshot_14.png)
TESTER AVEC UNE VALEUR SUPERIEUR A BALANCE
![Screenshot_15.png](screens%2FScreenshot_15.png)
Verifier eventstore
![Screenshot_16.png](screens%2FScreenshot_16.png)
