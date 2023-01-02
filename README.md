# idmp
RDF vocabulary for the Identification of Medicinal Products

## rdfs:seeAlso
* https://github.com/edmcouncil/idmp

## dev

``` clojure
user> (reset)
```

``` clojure
dev> (doc :idmp-sub)
=>
-------------------------
net.wikipunk.rdf.idmp-sub
  The regulated information on substances ontology provides a semantic model representing the definitions for exchanging basic concepts for the unique identification and exchange of regulated information on substances. It is derived from the ISO 11238:2018 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of regulated information on substances standard.
```

``` clojure
dev> (source idmp-amp/Amlodipine)
=>
(def Amlodipine
  "fully substituted dialkyl 1,4-dihydropyridine-3,5-dicarboxylate derivative, which is used for the treatment of hypertension, chronic stable angina and confirmed or suspected vasospastic angina"
  {:cmns-cls/isClassifiedBy :idmp-sub/OpticalActivity-EitherDirection,
   :db/ident :idmp-amp/Amlodipine,
   :dcterms/source
   ["https://www.ebi.ac.uk/chebi/chebiOntology.do?chebiId=CHEBI:2668"
    "https://chem.nlm.nih.gov/chemidplus/rn/88150-42-9"],
   :idmp-sub/hasMolecularFormula "C20H25ClN2O5",
   :idmp-sub/hasMolecularFormulaByMoiety "C20H25ClN2O5",
   :idmp-sub/hasMolecularWeight :idmp-amp/AmlodipineMolecularWeight,
   :idmp-sub/hasNumberOfMoieties 1,
   :idmp-sub/hasStereochemistry :idmp-sub/Stereochemistry-Racemic,
   :idmp-sub/hasStructure :idmp-amp/AmlodipineMolecularStructure,
   :idmp-sub/isActiveMoietyOf [:idmp-amp/AmlodipineBesylate
                               :idmp-amp/AmlodipineMesylateMonohydrate],
   :rdf/type
   [:idmp-sub/ChemicalSubstance :owl/NamedIndividual :idmp-sub/Moiety],
   :rdfs/label "amlodipine",
   :skos/definition
   "fully substituted dialkyl 1,4-dihydropyridine-3,5-dicarboxylate derivative, which is used for the treatment of hypertension, chronic stable angina and confirmed or suspected vasospastic angina",
   :skos/note
   "It is a long-acting dihydropyridine calcium channel blocker effective in the treatment of angina pectoris and hypertension."})
```
