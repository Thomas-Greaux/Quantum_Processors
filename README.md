# Quantum_Processors

Modifications des circuits (05/01/2017):
Nous avons du modifier les circuits du contrôleur ainsi que l'organisation des branchements 
dans le processeur pour arriver à un composant fonctionnel.
- Dans le contrôleur, nous nous sommes rendu compte qu'une partie des circuits n'était pas tout à fait fonctionnelle
et que la manière dont avait été faite le contrôleur ne permettait pas une maintenabilité et un arrangement facile des
circuits. C'est pourquoi le controleur a totalement été refait, en séparant les catégories dans des sous-circuits.
L'utilisation des multiplexers fournit dans logisim a permis une meilleure organisation et surtout a rendu le contrôleur
entièrement fonctionnel et plus compréhensible.
- Au niveau du processeur, les branchements était correctes, ils ont simplement été retravaillé.

Dans le dossier circuits se trouve une série d'instruction. Il y a au moins une instruction testée par catégorie.