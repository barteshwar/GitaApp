package com.example.openingpage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
     Button selected_sholkas;
     Button completeGita;
     Button shlokaOfTheDay;
     Button randomShloka;
     Button aboutTheGita;
     Button shareApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Bhagwad Gita App");
        MediaPlayer ring= MediaPlayer.create(getApplicationContext(), R.raw.sound);
        ring.start();

        GitaText gitaText = GitaText.getInstance();
        String[][] shlokas = {{"Dhrtarastra said: O Sanjaya, after assembling in the place of pilgrimage at Kuruksetra, what did my sons and the sons of Pandu do, being desirous to fight?   ",
                "Sanjaya said: O King, after looking over the army gathered by the sons of Pandu, King Duryodhana went to his teacher and began to speak the following words:   ",
                "O my teacher, behold the great army of the sons of Pandu, so expertly arranged by your intelligent disciple, the son of Drupada.   ",
                "Here in this army there are many heroic bowmen equal in fighting to Bhima and Arjuna; there are also great fighters like Yuyudhana, Virata and Drupada.   ",
                "There are also great, heroic, powerful fighters like Dhrstaketu, Cekitana, Kasiraja, Purujit, Kuntibhoja and Saibya.   ",
                "There are the mighty Yudhamanyu, the very powerful Uttamauja, the son of Subhadra and the sons of Draupadi. All these warriors are great chariot fighters.   ",
                "O best of the brahmanas, for your information, let me tell you about the captains who are especially qualified to lead my military force.   ",
                "There are personalities like yourself, Bhisma, Karna, Krpa, Asvatthama, Vikarna and the son of Somadatta called Bhurisrava, who are always victorious in battle.   ",
                "There are many other heroes who are prepared to lay down their lives for my sake. All of them are well equipped with different kinds of weapons, and all are experienced in military science.   ",
                "Our strength is immeasurable, and we are perfectly protected by Grandfather Bhisma, whereas the strength of the Pandavas, carefully protected by Bhima, is limited.   ",
                "Now all of you must give full support to Grandfather Bhisma, standing at your respective strategic points in the phalanx of the army.   ",
                "Then Bhisma, the great valiant grandsire of the Kuru dynasty, the grandfather of the fighters, blew his conchshell very loudly like the sound of a lion, giving Duryodhana joy.   ",
                "After that, the conchshells, bugles, trumpets, drums and horns were all suddenly sounded, and the combined sound was tumultuous.   ",
                "On the other side, both Lord Krsna and Arjuna, stationed on a great chariot drawn by white horses, sounded their transcendental conchshells.   ",
                "Then, Lord Krsna blew His conchshell, called Pancajanya; Arjuna blew his, the Devadatta; and Bhima, the voracious eater and performer of Herculean tasks, blew his terrific conchshell called Paundram.   ",
                "King Yudhisthira, the son of Kunti, blew his conchshell, the Anantavijaya, and Nakula and Sahadeva blew the Sughosa and Manipuspaka. That great archer the King of Kasi, the great fighter Sikhandi, Dhrstadyumna, Virata and the unconquerable Satyaki, Drupada, the sons of Draupadi, and the others, O King, such as the son of Subhadra, greatly armed, all blew their respective conchshells.   ",
                "The blowing of these different conchshells became uproarious, and thus, vibrating both in the sky and on the earth, it shattered the hearts of the sons of Dhrtarastra.   ",
                "O King, at that time Arjuna, the son of Pandu, who was seated in his chariot, his flag marked with Hanuman, took up his bow and prepared to shoot his arrows, looking at the sons of Dhrtarastra. O King, Arjuna then spoke to Hrsikesa [Krsna] these words:   ",
                "Arjuna said: O infallible one, please draw my chariot between the two armies so that I may see who is present here, who is desirous of fighting, and with whom I must contend in this great battle attempt.   ",
                "Let me see those who have come here to fight, wishing to please the evil-minded son of Dhrtarastra.   ",
                "Sanjaya said: O descendant of Bharata, being thus addressed by Arjuna, Lord Krsna drew up the fine chariot in the midst of the armies of both parties.   ",
                "In the presence of Bhisma, Drona and all other chieftains of the world, Hrsikesa, the Lord, said, Just behold, Partha, all the Kurus who are assembled here.   ",
                "There Arjuna could see, within the midst of the armies of both parties, his fathers, grandfathers, teachers, maternal uncles, brothers, sons, grandsons, friends, and also his father-in-law and well-wishers-all present there.   ",
                "When the son of Kunti, Arjuna, saw all these different grades of friends and relatives, he became overwhelmed with compassion and spoke thus:   ",
                "Arjuna said: My dear Krsna, seeing my friends and relatives present before me in such a fighting spirit, I feel the limbs of my body quivering and my mouth drying up.   ",
                "My whole body is trembling, and my hair is standing on end. My bow Gandiva is slipping from my hand, and my skin is burning.   ",
                "I am now unable to stand here any longer. I am forgetting myself, and my mind is reeling. I foresee only evil, O killer of the Kesi demon.   ",
                "I do not see how any good can come from killing my own kinsmen in this battle, nor can I, my dear Krsna, desire any subsequent victory, kingdom, or happiness.   ",
                "O Govinda, of what avail to us are kingdoms, happiness or even life itself when all those for whom we may desire them are now arrayed in this battlefield? O Madhusudana, when teachers, fathers, sons, grandfathers, maternal uncles, fathers-in-law, grandsons, brothers-in-law and all relatives are ready to give up their lives and properties and are standing before me, then why should I wish to kill them, though I may survive? O maintainer of all creatures, I am not prepared to fight with them even in exchange for the three worlds, let alone this earth.   ",
                "Sin will overcome us if we slay such aggressors. Therefore it is not proper for us to kill the sons of Dhrtarastra and our friends. What should we gain, O Krsna, husband of the goddess of fortune, and how could we be happy by killing our own kinsmen?   ",
                "O Janardana, although these men, overtaken by greed, see no fault in killing one's family or quarreling with friends, why should we, with knowledge of the sin, engage in these acts?   ",
                "With the destruction of dynasty, the eternal family tradition is vanquished, and thus the rest of the family becomes involved in irreligious practice.   ",
                "When irreligion is prominent in the family, O Krsna, the women of the family become corrupt, and from the degradation of womanhood, O descendant of Vrsni, comes unwanted progeny.   ",
                "When there is increase of unwanted population, a hellish situation is created both for the family and for those who destroy the family tradition. In such corrupt families, there is no offering of oblations of food and water to the ancestors.   ",
                "Due to the evil deeds of the destroyers of family tradition, all kinds of community projects and family welfare activities are devastated.   ",
                "O Krsna, maintainer of the people, I have heard by disciplic succession that those who destroy family traditions dwell always in hell.   ",
                "Alas, how strange it is that we are preparing to commit greatly sinful acts, driven by the desire to enjoy royal happiness.   ",
                "I would consider it better for the sons of Dhrtarastra to kill me unarmed and unresisting, rather than fight with them.   ",
                "Sanjaya said: Arjuna, having thus spoken on the battlefield, cast aside his bow and arrows and sat down on the chariot, his mind overwhelmed with grief."},



                {"Sanjaya said: Seeing Arjuna full of compassion and very sorrowful, his eyes brimming with tears, Madhusudana, Krsna, spoke the following words.   ",
                        "The Supreme Person [Bhagavan] said: My dear Arjuna, how have these impurities come upon you? They are not at all befitting a man who knows the progressive values of life. They do not lead to higher planets, but to infamy.   ",
                        "O son of Prtha, do not yield to this degrading impotence. It does not become you. Give up such petty weakness of heart and arise, O chastiser of the enemy.   ",
                        "Arjuna said: O killer of Madhu [Krsna], how can I counterattack with arrows in battle men like Bhisma and Drona, who are worthy of my worship?   ",
                        "It is better to live in this world by begging than to live at the cost of the lives of great souls who are my teachers. Even though they are avaricious, they are nonetheless superiors. If they are killed, our spoils will be tainted with blood.   ",
                        "Nor do we know which is better—conquering them or being conquered by them. The sons of Dhrtarastra, whom if we killed we should not care to live, are now standing before us on this battlefield.   ",
                        "Now I am confused about my duty and have lost all composure because of weakness. In this condition I am asking You to tell me clearly what is best for me. Now I am Your disciple, and a soul surrendered unto You. Please instruct me.   ",
                        "I can find no means to drive away this grief which is drying up my senses. I will not be able to destroy it even if I win an unrivalled kingdom on the earth with sovereignty like that of the demigods in heaven.   ",
                        "Sanjaya said: Having spoken thus, Arjuna, chastiser of enemies, told Krsna, Govinda, I shall not fight, and fell silent.   ",
                        "O descendant of Bharata, at that time Krsna, smiling, in the midst of both the armies, spoke the following words to the grief-stricken Arjuna.   ",
                        "The Blessed Lord said: While speaking learned words, you are mourning for what is not worthy of grief. Those who are wise lament neither for the living nor the dead.   ",
                        "Never was there a time when I did not exist, nor you, nor all these kings; nor in the future shall any of us cease to be.   ",
                        "As the embodied soul continually passes, in this body, from boyhood to youth to old age, the soul similarly passes into another body at death. The self-realized soul is not bewildered by such a change.   ",
                        "O son of Kunti, the nonpermanent appearance of happiness and distress, and their disappearance in due course, are like the appearance and disappearance of winter and summer seasons. They arise from sense perception, O scion of Bharata, and one must learn to tolerate them without being disturbed.   ",
                        "O best among men [Arjuna], the person who is not disturbed by happiness and distress and is steady in both is certainly eligible for liberation.   ",
                        "Those who are seers of the truth have concluded that of the nonexistent there is no endurance, and of the existent there is no cessation. This seers have concluded by studying the nature of both.   ",
                        "Know that which pervades the entire body is indestructible. No one is able to destroy the imperishable soul.   ",
                        "Only the material body of the indestructible, immeasurable and eternal living entity is subject to destruction; therefore, fight, O descendant of Bharata.   ",
                        "He who thinks that the living entity is the slayer or that he is slain, does not understand. One who is in knowledge knows that the self slays not nor is slain.   ",
                        "For the soul there is never birth nor death. Nor, having once been, does he ever cease to be. He is unborn, eternal, ever-existing, undying and primeval. He is not slain when the body is slain.   ",
                        "O Partha, how can a person who knows that the soul is indestructible, unborn, eternal and immutable, kill anyone or cause anyone to kill?   ",
                        "As a person puts on new garments, giving up old ones, similarly, the soul accepts new material bodies, giving up the old and useless ones.   ",
                        "The soul can never be cut into pieces by any weapon, nor can he be burned by fire, nor moistened by water, nor withered by the wind.   ",
                        "This individual soul is unbreakable and insoluble, and can be neither burned nor dried. He is everlasting, all-pervading, unchangeable, immovable and eternally the same.   ",
                        "It is said that the soul is invisible, inconceivable, immutable, and unchangeable. Knowing this, you should not grieve for the body.   ",
                        "If, however, you think that the soul is perpetually born and always dies, still you have no reason to lament, O mighty-armed.   ",
                        "For one who has taken his birth, death is certain; and for one who is dead, birth is certain. Therefore, in the unavoidable discharge of your duty, you should not lament.   ",
                        "All created beings are unmanifest in their beginning, manifest in their interim state, and unmanifest again when they are annihilated. So what need is there for lamentation?   ",
                        "Some look on the soul as amazing, some describe him as amazing, and some hear of him as amazing, while others, even after hearing about him, cannot understand him at all.   ",
                        "O descendant of Bharata, he who dwells in the body is eternal and can never be slain. Therefore you need not grieve for any creature.   ",
                        "Considering your specific duty as a ksatriya, you should know that there is no better engagement for you than fighting on religious principles; and so there is no need for hesitation.   ",
                        "O Partha, happy are the ksatriyas to whom such fighting opportunities come unsought, opening for them the doors of the heavenly planets.   ",
                        "If, however, you do not fight this religious war, then you will certainly incur sins for neglecting your duties and thus lose your reputation as a fighter.   ",
                        "People will always speak of your infamy, and for one who has been honored, dishonor is worse than death.   ",
                        "The great generals who have highly esteemed your name and fame will think that you have left the battlefield out of fear only, and thus they will consider you a coward.   ",
                        "Your enemies will describe you in many unkind words and scorn your ability. What could be more painful for you?   ",
                        "O son of Kunti, either you will be killed on the battlefield and attain the heavenly planets, or you will conquer and enjoy the earthly kingdom. Therefore get up and fight with determination.   ",
                        "Do thou fight for the sake of fighting, without considering happiness or distress, loss or gain, victory or defeat—and, by so doing, you shall never incur sin.   ",
                        "Thus far I have declared to you the analytical knowledge of sankhya philosophy. Now listen to the knowledge of yoga whereby one works without fruitive result. O son of Prtha, when you act by such intelligence, you can free yourself from the bondage of works.   ",
                        "In this endeavor there is no loss or diminution, and a little advancement on this path can protect one from the most dangerous type of fear.   ",
                        "Those who are on this path are resolute in purpose, and their aim is one. O beloved child of the Kurus, the intelligence of those who are irresolute is many-branched.   ",
                        "Men of small knowledge are very much attached to the flowery words of the Vedas, which recommend various fruitive activities for elevation to heavenly planets, resultant good birth, power, and so forth. Being desirous of sense gratification and opulent life, they say that there is nothing more than this.   ",
                        "In the minds of those who are too attached to sense enjoyment and material opulence, and who are bewildered by such things, the resolute determination of devotional service to the Supreme Lord does not take place.   ",
                        "The Vedas mainly deal with the subject of the three modes of material nature. Rise above these modes, O Arjuna. Be transcendental to all of them. Be free from all dualities and from all anxieties for gain and safety, and be established in the Self.   ",
                        "All purposes that are served by the small pond can at once be served by the great reservoirs of water. Similarly, all the purposes of the Vedas can be served to one who knows the purpose behind them.   ",
                        "You have a right to perform your prescribed duty, but you are not entitled to the fruits of action. Never consider yourself to be the cause of the results of your activities, and never be attached to not doing your duty.   ",
                        "Be steadfast in yoga, O Arjuna. Perform your duty and abandon all attachment to success or failure. Such evenness of mind is called yoga.   ",
                        "O Dhananjaya, rid yourself of all fruitive activities by devotional service, and surrender fully to that consciousness. Those who want to enjoy the fruits of their work are misers.   ",
                        "A man engaged in devotional service rids himself of both good and bad actions even in this life. Therefore strive for yoga, O Arjuna, which is the art of all work.   ",
                        "The wise, engaged in devotional service, take refuge in the Lord, and free themselves from the cycle of birth and death by renouncing the fruits of action in the material world. In this way they can attain that state beyond all miseries.   ",
                        "When your intelligence has passed out of the dense forest of delusion, you shall become indifferent to all that has been heard and all that is to be heard.   ",
                        "When your mind is no longer disturbed by the flowery language of the Vedas, and when it remains fixed in the trance of self-realization, then you will have attained the Divine consciousness.   ",
                        "Arjuna said: What are the symptoms of one whose consciousness is thus merged in Transcendence? How does he speak, and what is his language? How does he sit, and how does he walk?   ",
                        "The Blessed Lord said: O Partha, when a man gives up all varieties of sense desire which arise from mental concoction, and when his mind finds satisfaction in the self alone, then he is said to be in pure transcendental consciousness.   ",
                        "One who is not disturbed in spite of the threefold miseries, who is not elated when there is happiness, and who is free from attachment, fear and anger, is called a sage of steady mind.   ",
                        "He who is without attachment, who does not rejoice when he obtains good, nor lament when he obtains evil, is firmly fixed in perfect knowledge.   ",
                        "One who is able to withdraw his senses from sense objects, as the tortoise draws his limbs within the shell, is to be understood as truly situated in knowledge.   ",
                        "The embodied soul may be restricted from sense enjoyment, though the taste for sense objects remains. But, ceasing such engagements by experiencing a higher taste, he is fixed in consciousness.   ",
                        "The senses are so strong and impetuous, O Arjuna, that they forcibly carry away the mind even of a man of discrimination who is endeavoring to control them.   ",
                        "One who restrains his senses and fixes his consciousness upon Me is known as a man of steady intelligence.   ",
                        "While contemplating the objects of the senses, a person develops attachment for them, and from such attachment lust develops, and from lust anger arises.   ",
                        "From anger, delusion arises, and from delusion bewilderment of memory. When memory is bewildered, intelligence is lost, and when intelligence is lost, one falls down again into the material pool.   ",
                        "One who can control his senses by practicing the regulated principles of freedom can obtain the complete mercy of the Lord and thus become free from all attachment and aversion.   ",
                        "For one who is so situated in the Divine consciousness, the threefold miseries of material existence exist no longer; in such a happy state, one's intelligence soon becomes steady.   ",
                        "One who is not in transcendental consciousness can have neither a controlled mind nor steady intelligence, without which there is no possibility of peace. And how can there be any happiness without peace?   ",
                        "As a boat on the water is swept away by a strong wind, even one of the senses on which the mind focuses can carry away a man's intelligence.   ",
                        "Therefore, O mighty-armed, one whose senses are restrained from their objects is certainly of steady intelligence.   ",
                        "What is night for all beings is the time of awakening for the self-controlled; and the time of awakening for all beings is night for the introspective sage.   ",
                        "A person who is not disturbed by the incessant flow of desires—that enter like rivers into the ocean which is ever being filled but is always still—can alone achieve peace, and not the man who strives to satisfy such desires.   ",
                        "A person who has given up all desires for sense gratification, who lives free from desires, who has given up all sense of proprietorship and is devoid of false ego—he alone can attain real peace.   ",
                        "That is the way of the spiritual and godly life, after attaining which a man is not bewildered. Being so situated, even at the hour of death, one can enter into the kingdom of God."},


                {"Arjuna said: O Janardana, O Kesava, why do You urge me to engage in this ghastly warfare, if You think that intelligence is better than fruitive work?   ",
                        "My intelligence is bewildered by Your equivocal instructions. Therefore, please tell me decisively what is most beneficial for me.   ",
                        "The Blessed Lord said: O sinless Arjuna, I have already explained that there are two classes of men who realize the Self. Some are inclined to understand Him by empirical, philosophical speculation, and others are inclined to know Him by devotional work.   ",
                        "Not by merely abstaining from work can one achieve freedom from reaction, nor by renunciation alone can one attain perfection.   ",
                        "All men are forced to act helplessly according to the impulses born of the modes of material nature; therefore no one can refrain from doing something, not even for a moment.   ",
                        "One who restrains the senses and organs of action, but whose mind dwells on sense objects, certainly deludes himself and is called a pretender.   ",
                        "On the other hand, he who controls the senses by the mind and engages his active organs in works of devotion, without attachment, is by far superior.   ",
                        "Perform your prescribed duty, for action is better than inaction. A man cannot even maintain his physical body without work.   ",
                        "Work done as a sacrifice for Visnu has to be performed, otherwise work binds one to this material world. Therefore, O son of Kunti, perform your prescribed duties for His satisfaction, and in that way you will always remain unattached and free from bondage.   ",
                        "In the beginning of creation, the Lord of all creatures sent forth generations of men and demigods, along with sacrifices for Visnu, and blessed them by saying, Be thou happy by this yajna [sacrifice] because its performance will bestow upon you all desirable things.   ",
                        "The demigods, being pleased by sacrifices, will also please you; thus nourishing one another, there will reign general prosperity for all.   ",
                        "In charge of the various necessities of life, the demigods, being satisfied by the performance of yajna [sacrifice], supply all necessities to man. But he who enjoys these gifts, without offering them to the demigods in return, is certainly a thief.   ",
                        "The devotees of the Lord are released from all kinds of sins because they eat food which is offered first for sacrifice. Others, who prepare food for personal sense enjoyment, verily eat only sin.   ",
                        "All living bodies subsist on food grains, which are produced from rain. Rains are produced by performance of yajna [sacrifice], and yajna is born of prescribed duties.   ",
                        "Regulated activities are prescribed in the Vedas, and the Vedas are directly manifested from the Supreme Personality of Godhead. Consequently the all-pervading Transcendence is eternally situated in acts of sacrifice.   ",
                        "My dear Arjuna, a man who does not follow this prescribed Vedic system of sacrifice certainly leads a life of sin, for a person delighting only in the senses lives in vain.   ",
                        "One who is, however, taking pleasure in the self, who is illumined in the self, who rejoices in and is satisfied with the self only, fully satiated—for him there is no duty.   ",
                        "A self-realized man has no purpose to fulfill in the discharge of his prescribed duties, nor has he any reason not to perform such work. Nor has he any need to depend on any other living being.   ",
                        "Therefore, without being attached to the fruits of activities, one should act as a matter of duty; for by working without attachment, one attains the Supreme.   ",
                        "Even kings like Janaka and others attained the perfectional stage by performance of prescribed duties. Therefore, just for the sake of educating the people in general, you should perform your work.   ",
                        "Whatever action is performed by a great man, common men follow in his footsteps. And whatever standards he sets by exemplary acts, all the world pursues.   ",
                        "O son of Prtha, there is no work prescribed for Me within all the three planetary systems. Nor am I in want of anything, nor have I need to obtain anything—and yet I am engaged in work.   ",
                        "For, if I did not engage in work, O Partha, certainly all men would follow My path.   ",
                        "If I should cease to work, then all these worlds would be put to ruination. I would also be the cause of creating unwanted population, and I would thereby destroy the peace of all sentient beings.   ",
                        "As the ignorant perform their duties with attachment to results, similarly the learned may also act, but without attachment, for the sake of leading people on the right path.   ",
                        "Let not the wise disrupt the minds of the ignorant who are attached to fruitive action. They should not be encouraged to refrain from work, but to engage in work in the spirit of devotion.   ",
                        "The bewildered spirit soul, under the influence of the three modes of material nature, thinks himself to be the doer of activities, which are in actuality carried out by nature.   ",
                        "One who is in knowledge of the Absolute Truth, O mighty-armed, does not engage himself in the senses and sense gratification, knowing well the differences between work in devotion and work for fruitive results.   ",
                        "Bewildered by the modes of material nature, the ignorant fully engage themselves in material activities and become attached. But the wise should not unsettle them, although these duties are inferior due to the performers' lack of knowledge.   ",
                        "Therefore, O Arjuna, surrendering all your works unto Me, with mind intent on Me, and without desire for gain and free from egoism and lethargy, fight.   ",
                        "One who executes his duties according to My injunctions and who follows this teaching faithfully, without envy, becomes free from the bondage of fruitive actions.   ",
                        "But those who, out of envy, disregard these teachings and do not practice them regularly, are to be considered bereft of all knowledge, befooled, and doomed to ignorance and bondage.   ",
                        "Even a man of knowledge acts according to his own nature, for everyone follows his nature. What can repression accomplish?   ",
                        "Attraction and repulsion for sense objects are felt by embodied beings, but one should not fall under the control of senses and sense objects because they are stumbling blocks on the path of self-realization.   ",
                        "It is far better to discharge one's prescribed duties, even though they may be faulty, than another's duties. Destruction in the course of performing one's own duty is better than engaging in another's duties, for to follow another's path is dangerous.   ",
                        "Arjuna said: O descendant of Vrsni, by what is one impelled to sinful acts, even unwillingly, as if engaged by force?   ",
                        "The Blessed Lord said: It is lust only, Arjuna, which is born of contact with the material modes of passion and later transformed into wrath, and which is the all-devouring, sinful enemy of this world.   ",
                        "As fire is covered by smoke, as a mirror is covered by dust, or as the embryo is covered by the womb, similarly, the living entity is covered by different degrees of this lust.   ",
                        "Thus, a man's pure consciousness is covered by his eternal enemy in the form of lust, which is never satisfied and which burns like fire.   ",
                        "The senses, the mind and the intelligence are the sitting places of this lust, which veils the real knowledge of the living entity and bewilders him.   ",
                        "Therefore, O Arjuna, best of the Bharatas, in the very beginning curb this great symbol of sin [lust] by regulating the senses, and slay this destroyer of knowledge and self-realization.   ",
                        "The working senses are superior to dull matter; mind is higher than the senses; intelligence is still higher than the mind; and he [the soul] is even higher than the intelligence.   ",
                        "Thus knowing oneself to be transcendental to material senses, mind and intelligence, one should control the lower self by the higher self and thus—by spiritual strength—conquer this insatiable enemy known as lust."},




                {"The Blessed Lord said: I instructed this imperishable science of yoga to the sun-god, Vivasvan, and Vivasvan instructed it to Manu, the father of mankind, and Manu in turn instructed it to Iksvaku.   ",
                        "This supreme science was thus received through the chain of disciplic succession, and the saintly kings understood it in that way. But in course of time the succession was broken, and therefore the science as it is appears to be lost.   ",
                        "That very ancient science of the relationship with the Supreme is today told by Me to you because you are My devotee as well as My friend; therefore you can understand the transcendental mystery of this science.   ",
                        "Arjuna said: The sun-god Vivasvan is senior by birth to You. How am I to understand that in the beginning You instructed this science to him?   ",
                        "The Blessed Lord said: Many, many births both you and I have passed. I can remember all of them, but you cannot, O subduer of the enemy!   ",
                        "Although I am unborn and My transcendental body never deteriorates, and although I am the Lord of all sentient beings, I still appear in every millennium in My original transcendental form.   ",
                        "Whenever and wherever there is a decline in religious practice, O descendant of Bharata, and a predominant rise of irreligion—at that time I descend Myself.   ",
                        "In order to deliver the pious and to annihilate the miscreants, as well as to reestablish the principles of religion, I advent Myself millennium after millennium.   ",
                        "One who knows the transcendental nature of My appearance and activities does not, upon leaving the body, take his birth again in this material world, but attains My eternal abode, O Arjuna.   ",
                        "Being freed from attachment, fear and anger, being fully absorbed in Me and taking refuge in Me, many, many persons in the past became purifled by knowledge of Me—and thus they all attained transcendental love for Me.   ",
                        "All of them—as they surrender unto Me—I reward accordingly. Everyone follows My path in all respects, O son of Prtha.   ",
                        "Men in this world desire success in fruitive activities, and therefore they worship the demigods. Quickly, of course, men get results from fruitive work in this world.   ",
                        "According to the three modes of material nature and the work ascribed to them, the four divisions of human society were created by Me. And, although I am the creator of this system, you should know that I am yet the non-doer, being unchangeable.   ",
                        "There is no work that affects Me; nor do I aspire for the fruits of action. One who understands this truth about Me also does not become entangled in the fruitive reactions of work.   ",
                        "All the liberated souls in ancient times acted with this understanding and so attained liberation. Therefore, as the ancients, you should perform your duty in this divine consciousness.   ",
                        "Even the intelligent are bewildered in determining what is action and what is inaction. Now I shall explain to you what action is, knowing which you shall be liberated from all sins.   ",
                        "The intricacies of action are very hard to understand. Therefore one should know properly what action is, what forbidden action is, and what inaction is.   ",
                        "One who sees inaction in action, and action in inaction, is intelligent among men, and he is in the tranecendental position, although engaged in all sorts of activities.   ",
                        "One is understood to be in full knowledge whose every act is devoid of desire for sense gratification. He is said by sages to be a worker whose fruitive action is burned up by the fire of perfect knowledge.   ",
                        "Abandoning all attachment to the results of his activities, ever satisfied and independant, he performs no fruitive action, although engaged in all kinds of undertakings.   ",
                        "Such a man of understanding acts with mind and intelligence perfectly controlled, gives up all sense of proprietorship over his possessions and acts only for the bare necessities of life. Thus working, he is not affected by sinful reactions.   ",
                        "He who is satisfied with gain which comes of its own accord, who is free from duality and does not envy, who is steady both in success and failure, is never entangled, although performing actions.   ",
                        "The work of a man who is unattached to the modes of material nature and who is fully situated in transcendental knowledge merges entirely into transcendence.   ",
                        "A person who is fully absorbed in Krsna consciousness is sure to attain the spiritual kingdom because of his full contribution to spiritual activities, in which the consummation is absolute and that which is offered is of the same spiritual nature.   ",
                        "Some yogis perfectly worship the demigods by offering different sacrifices to them, and some of them offer sacrffices in the fire of the Supreme Brahman.   ",
                        "Some of them sacrifice the hearing process and the senses in the fire of the controlled mind, and others sacrifice the objects of the senses, such as sound, in the fire of sacrifice.   ",
                        "Those who are interested in self-realization, in terms of mind and sense control, offer the functions of all the senses, as well as the vital force [breath], as oblations into the fire of the controlled mind.   ",
                        "There are others who, enlightened by sacrificing their material possessions in severe austerities, take strict vows and practice the yoga of eightfold mysticism, and others study the Vedas for the advancement of transcendental knowledge.   ",
                        "And there are even others who are inclined to the process of breath restraint to remain in trance, and they practice stopping the movement of the outgoing breath into the incoming, and incoming breath into the outgoing, and thus at last remain in trance, stopping all breathing. Some of them, curtailing the eating process, offer the outgoing breath into itself, as a sacrifice.   ",
                        "All these performers who know the meaning of sacrifice become cleansed of sinful reaction, and, having tasted the nectar of the remnants of such sacrifice, they go to the supreme eternal atmosphere.   ",
                        "O best of the Kuru dynasty, without sacrifice one can never live happily on this planet or in this life: what then of the next?   ",
                        "All these different types of sacrifice are approved by the Vedas, and all of them are born of different types of work. Knowing them as such, you will become liberated.   ",
                        "O chastiser of the enemy, the sacrifice of knowledge is greater than the sacrifice of material possessions. O son of Prtha, after all, the sacrifice of work culminates in transcendental knowledge.   ",
                        "Just try to learn the truth by approaching a spiritual master. Inquire from him submissively and render service unto him. The self-realized soul can impart knowledge unto you because he has seen the truth.   ",
                        "And when you have thus learned the truth, you will know that all living beings are but part of Me—and that they are in Me, and are Mine.   ",
                        "Even if you are considered to be the most sinful of all sinners, when you are situated in the boat of transcendental knowledge, you will be able to cross over the ocean of miseries.   ",
                        "As the blazing fire turns firewood to ashes, O Arjuna, so does the fire of knowledge burn to ashes all reactions to material activities.   ",
                        "In this world, there is nothing so sublime and pure as transcendental knowledge. Such knowledge is the mature fruit of all mysticism. And one who has achieved this enjoys the self within himself in due course of time.   ",
                        "A faithful man who is absorbed in transcendental knowledge and who subdues his senses quickly attains the supreme spiritual peace.   ",
                        "But ignorant and faithless persons who doubt the revealed scriptures do not attain God consciousness. For the doubting soul there is happiness neither in this world nor in the next.   ",
                        "Therefore, one who has renounced the fruits of his action, whose doubts are destroyed by transcendental knowledge, and who is situated firmly in the self, is not bound by works, O conqueror of riches.   ",
                        "Therefore the doubts which have arisen in your heart out of ignorance should be slashed by the weapon of knowledge. Armed with yoga, O Bharata, stand and fight."},





                {"Arjuna said: O Krsna, first of all You ask me to renounce work, and then again You recommend work with devotion. Now will You kindly tell me definitely which of the two is more beneficial?   ",
                        "The Blessed Lord said: The renunciation of work and work in devotion are both good for liberation. But, of the two, work in devotional service is better than renunciation of works.   ",
                        "One who neither hates nor desires the fruits of his activities is known to be always renounced. Such a person, liberated from all dualities, easily overcomes material bondage and is completely liberated, O mighty-armed Arjuna.   ",
                        "Only the ignorant speak of karma-yoga and devotional service as being different from the analytical study of the material world [sankhya]. Those who are actually learned say that he who applies himself well to one of these paths achieves the results of both.   ",
                        "One who knows that the position reached by means of renunciation can also be attained by works in devotional service and who therefore sees that the path of works and the path of renunciation are one, sees things as they are.   ",
                        "Unless one is engaged in the devotional service of the Lord, mere renunciation of activities cannot make one happy. The sages, purified by works of devotion, achieve the Supreme without delay.   ",
                        "One who works in devotion, who is a pure soul, and who controls his mind and senses, is dear to everyone, and everyone is dear to him. Though always working, such a man is never entangled.   ",
                        "A person in the divine consciousness, although engaged in seeing, hearing, touching, smelling, eating, moving about, sleeping, and breathing, always knows within himself that he actually does nothing at all. Because while speaking, evacuating, receiving, opening or closing his eyes, he always knows that only the material senses are engaged with their objects and that he is aloof from them.   ",
                        "One who performs his duty without attachment, surrendering the results unto the Supreme God, is not affected by sinful action, as the lotus leaf is untouched by water.   ",
                        "The yogis, abandoning attachment, act with body, mind, intelligence, and even with the senses, only for the purpose of purification.   ",
                        "The steadily devoted soul attains unadulterated peace because he offers the result of all activities to Me; whereas a person who is not in union with the Divine, who is greedy for the fruits of his labor, becomes entangled.   ",
                        "When the embodied living being controls his nature and mentally renounces all actions, he resides happily in the city of nine gates [the material body], neither working nor causing work to be done.   ",
                        "The embodied spirit, master of the city of his body, does not create activities, nor does he induce people to act, nor does he create the fruits of action. All this is enacted by the modes of material nature.   ",
                        "Nor does the Supreme Spirit assume anyone's sinful or pious activities. Embodied beings, however, are bewildered because of the ignorance which covers their real knowledge.   ",
                        "When, however, one is enlightened with the knowledge by which nescience is destroyed, then his knowledge reveals everything, as the sun lights up everything in the daytime.   ",
                        "When one's intelligence, mind, faith and refuge are all fixed in the Supreme, then one becomes fully cleansed of misgivings through complete knowledge and thus proceeds straight on the path of liberation.   ",
                        "The humble sage, by virtue of true knowledge, sees with equal vision a learned and gentle brahmana, a cow, an elephant, a dog and a dog-eater [outcaste] .   ",
                        "Those whose minds are established in sameness and equanimity have already conquered the conditions of birth and death. They are flawless like Brahman, and thus they are already situated in Brahman.   ",
                        "A person who neither rejoices upon achieving something pleasant nor laments upon obtaining something unpleasant, who is self-intelligent, unbewildered, and who knows the science of God, is to be understood as already situated in Transcendence.   ",
                        "Such a liberated person is not attracted to material sense pleasure or external objects but is always in trance, enjoying the pleasure within. In this way the self-realized person enjoys unlimited happiness, for he concentrates on the Supreme.   ",
                        "An intelligent person does not take part in the sources of misery, which are due to contact with the material senses. O son of Kunti, such pleasures have a beginning and an end, and so the wise man does not delight in them.   ",
                        "Before giving up this present body, if one is able to tolerate the urges of the material senses and check the force of desire and anger, he is a yogi and is happy in this world.   ",
                        "One whose happiness is within, who is active within, who rejoices within and is illumined within, is actually the perfect mystic. He is liberated in the Supreme, and ultimately he attains the Supreme.   ",
                        "One who is beyond duality and doubt, whose mind is engaged within, who is always busy working for the welfare of all sentient beings, and who is free from all sins, achieves liberation in the Supreme.   ",
                        "Those who are free from anger and all material desires, who are self-realized, self-disciplined and constantly endeavoring for perfection, are assured of liberation in the Supreme in the very near future.   ",
                        "Shutting out all external sense objects, keeping the eyes and vision concentrated between the two eyebrows, suspending the inward and outward breaths within the nostrils—thus controlling the mind, senses and intelligence, the tranecendentalist becomes free from desire, fear and anger. One who is always in this state is certainly liberated.   ",
                        "The sages, knowing Me as the ultimate purpose of all sacrifices and austerities, the Supreme Lord of all planets and demigods and the benefactor and well-wisher of all living entities, attain peace from the pangs of material miseries."},





                {"The Blessed Lord said: One who is unattached to the fruits of his work and who works as he is obligated is in the renounced order of life, and he is the true mystic: not he who lights no fire and performs no work.   ",
                        "What is called renunciation is the same as yoga, or linking oneself with the Supreme, for no one can become a yogi unless he renounces the desire for sense gratification.   ",
                        "For one who is a neophyte in the eightfold yoga system, work is said to be the means; and for one who has already attained to yoga, cessation of all material activities is said to be the means.   ",
                        "A person is said to have attained to yoga when, having renounced all material desires, he neither acts for sense gratification nor engages in fruitive activities.   ",
                        "A man must elevate himself by his own mind, not degrade himself. The mind is the friend of the conditioned soul, and his enemy as well.   ",
                        "For him who has conquered the mind, the mind is the best of friends; but for one who has failed to do so, his very mind will be the greatest enemy.   ",
                        "For one who has conquered the mind, the Supersoul is already reached, for he has attained tranquility. To such a man happiness and distress, heat and cold, honor and dishonor are all the same.   ",
                        "A person is said to be established in self-realization and is called a yogi [or mystic] when he is fully satisfied by virtue of acquired knowledge and realization. Such a person is situated in transcendence and is self-controlled. He sees everything—whether it be pebbles, stones or gold—as the same.   ",
                        "A person is said to be still further advanced when he regards all—the honest well-wisher, friends and enemies, the envious, the pious, the sinner and those who are indifferent and impartial—with an equal mind.   ",
                        "A transcendentalist should always try to concentrate his mind on the Supreme Self; he should live alone in a secluded place and should always carefully control his mind. He should be free from desires and feelings of possessiveness.   ",
                        "To practice yoga, one should go to a secluded place and should lay kusa-grass on the ground and then cover it with a deerskin and a soft cloth. The seat should neither be too high nor too low and should be situated in a sacred place. The yogi should then sit on it very firmly and should practice yoga by controlling the mind and the senses, purifying the heart and fixing the mind on one point.   ",
                        "One should hold one's body, neck and head erect in a straight line and stare steadily at the tip of the nose. Thus with an unagitated, subdued mind, devoid of fear, completely free from sex life, one should meditate upon Me within the heart and make Me the ultimate goal of life.   ",
                        "Thus practicing control of the body, mind and activities, the mystic transcendentalist attains to the kingdom of God [or the abode of Krsna] by cessation of material existence.   ",
                        "There is no possibility of one's becoming a yogi, O Arjuna, if one eats too much, or eats too little, sleeps too much or does not sleep enough.   ",
                        "He who is temperate in his habits of eating, sleeping, working and recreation can mitigate all material pains by practicing the yoga system.   ",
                        "When the yogi, by practice of yoga, disciplines his mental activities and becomes situated in Transcendence—devoid of all material desires—he is said to have attained yoga.   ",
                        "As a lamp in a windless place does not waver, so the transcendentalist, whose mind is controlled, remains always steady in his meditation on the transcendent Self.   ",
                        "The stage of perfection is called trance, or samadhi, when one's mind is completely restrained from material mental activities by practice of yoga. This is characterized by one's ability to see the self by the pure mind and to relish and rejoice in the self. In that joyous state, one is situated in boundless transcendental happiness and enjoys himself through transcendental senses. Established thus, one never departs from the truth, and upon gaining this he thinks there is no greater gain. Being situated in such a position, one is never shaken, even in the midst of greatest difficulty. This indeed is actual freedom from all miseries arising from material contact.   ",
                        "One should engage oneself in the practice of yoga with undeviating determination and faith. One should abandon, without exception, all material desires born of false ego and thus control all the senses on all sides by the mind.   ",
                        "Gradually, step by step, with full conviction, one should become situated in trance by means of intelligence, and thus the mind should be fixed on the Self alone and should think of nothing else.   ",
                        "From whatever and wherever the mind wanders due to its flickering and unsteady nature, one must certainly withdraw it and bring it back under the control of the Self.   ",
                        "The yogi whose mind is fixed on Me verily attains the highest happiness. By virtue of his identity with Brahman, he is liberated; his mind is peaceful, his passions are quieted, and he is freed from sin.   ",
                        "Steady in the Self, being freed from all material contamination, the yogi achieves the highest perfectional stage of happiness in touch with the Supreme Consciousness.   ",
                        "A true yogi observes Me in all beings, and also sees every being in Me. Indeed, the self-realized man sees Me everywhere.   ",
                        "For one who sees Me everywhere and sees everything in Me, I am never lost, nor is he ever lost to Me.   ",
                        "The yogi who knows that I and the Supersoul within all creatures are one worships Me and remains always in Me in all circumstances.   ",
                        "He is a perfect yogi who, by comparison to his own self, sees the true equality of all beings, both in their happiness and distress, O Arjuna!   ",
                        "Arjuna said: O Madhusudana, the system of yoga which you have summarized appears impractical and unendurable to me, for the mind is restless and unsteady.   ",
                        "For the mind is restless, turbulent, obstinate and very strong, O Krsna, and to subdue it is, it seems to me, more difficult than controlling the wind.   ",
                        "The Blessed Lord said: O mighty-armed son of Kunti, it is undoubtedly very difficult to curb the restless mind, but it is possible by constant practice and by detachment.   ",
                        "For one whose mind is unbridled, self-realization is difficult work. But he whose mind is controlled and who strives by right means is assured of success. That is My opinion.   ",
                        "Arjuna said: What is the destination of the man of faith who does not persevere, who in the beginning takes to the process of self-realization but who later desists due to worldly-mindedness and thus does not attain perfection in mysticism?   ",
                        "O mighty-armed Krsna, does not such a man, being deviated from the path of Transcendence, perish like a riven cloud, with no position in any sphere?   ",
                        "This is my doubt O Krsna, and I ask You to dispel it completely. But for Yourself, no one is to be found who can destroy this doubt.   ",
                        "The Blessed Lord said: Son of Prtha, a transcendentalist engaged in auspicious activities does not meet with destruction either in this world or in the spiritual world; one who does good, My friend, is never overcome by evil.   ",
                        "The unsuccessful yogi, after many, many years of enjoyment on the planets of the pious living entities, is born into a family of righteous people, or into a family of rich aristocracy.   ",
                        "Or he takes his birth in a family of transcendentalists who are surely great in wisdom. Verily, such a birth is rare in this world.   ",
                        "On taking such a birth, he again revives the divine consciousness of his previous life, and he tries to make further progress in order to achieve complete success, O son of Kuru.   ",
                        "By virtue of the divine consciousness of his previous life, he automatically becomes attracted to the yogic principles—even without seeking them. Such an inquisitive transcendentalist, striving for yoga, stands always above the ritualistic principles of the scriptures.   ",
                        "But when the yogi engages himself with sincere endeavor in making further progress, being washed of all contaminations, then ultimately, after many, many births of practice, he attains the supreme goal.   ",
                        "A yogi is greater than the ascetic, greater than the empiricist and greater than the fruitive worker. Therefore, O Arjuna, in all circumstances, be a yogi.   ",
                        "And of all yogis, he who always abides in Me with great faith, worshiping Me in transcendental loving service, is most intimately united with Me in yoga and is the highest of all."},





                {"Now hear, O son of Prtha [Arjuna], how by practicing yoga in full consciousness of Me, with mind attached to Me, you can know Me in full, free from doubt.   ",
                        "I shall now declare unto you in full this knowledge both phenomenal and noumenal, by knowing which there shall remain nothing further to be known.   ",
                        "Out of many thousands among men, one may endeavor for perfection, and of those who have achieved perfection, hardly one knows Me in truth.   ",
                        "Earth, water, fire, air, ether, mind, intelligence and false ego—altogether these eight comprise My separated material energies.   ",
                        "Besides this inferior nature, O mighty-armed Arjuna, there is a superior energy of Mine, which are all living entities who are struggling with material nature and are sustaining the universe.   ",
                        "Of all that is material and all that is spiritual in this world, know for certain that I am both its origin and dissolution.   ",
                        "O conquerer of wealth [Arjuna], there is no Truth superior to Me. Everything rests upon Me, as pearls are strung on a thread.   ",
                        "O son of Kunti [Arjuna], I am the taste of water, the light of the sun and the moon, the syllable om in the Vedic mantras; I am the sound in ether and ability in man.   ",
                        "I am the original fragrance of the earth, and I am the heat in fire. I am the life of all that lives, and I am the penances of all ascetics.   ",
                        "O son of Prtha, know that I am the original seed of all existences, the intelligence of the intelligent, and the prowess of all powerful men.   ",
                        "I am the strength of the strong, devoid of passion and desire. I am sex life which is not contrary to religious principles, O Lord of the Bharatas [Arjuna].   ",
                        "All states of being—be they of goodness, passion or ignorance—are manifested by My energy. I am, in one sense, everything—but I am independant. I am not under the modes of this material nature.   ",
                        "Deluded by the three modes [goodness, passion and ignorance], the whole world does not know Me who am above the modes and inexhaustible.   ",
                        "This divine energy of Mine, consisting of the three modes of material nature, is difficult to overcome. But those who have surrendered unto Me can easily cross beyond it.   ",
                        "Those miscreants who are grossly foolish, lowest among mankind, whose knowledge is stolen by illusion, and who partake of the atheistic nature of demons, do not surrender unto Me.   ",
                        "O best among the Bharatas [Arjuna], four kinds of pious men render devotional service unto Me—the distressed, the desirer of wealth, the inquisitive, and he who is searching for knowledge of the Absolute.   ",
                        "Of these, the wise one who is in full knowledge in union with Me through pure devotional service is the best. For I am very dear to him, and he is dear to Me.   ",
                        "All these devotees are undoubtedly magnanimous souls, but he who is situated in knowledge of Me I consider verily to dwell in Me. Being engaged in My transcendental service, he attains Me.   ",
                        "After many births and deaths, he who is actually in knowledge surrenders unto Me, knowing Me to be the cause of all causes and all that is. Such a great soul is very rare.   ",
                        "Those whose minds are distorted by material desires surrender unto demigods and follow the particular rules and regulations of worship according to their own natures.   ",
                        "I am in everyone's heart as the Supersoul. As soon as one desires to worship the demigods, I make his faith steady so that he can devote himself to some particular deity.   ",
                        "Endowed with such a faith, he seeks favors of a particular demigod and obtains his desires. But in actuality these benefits are bestowed by Me alone.   ",
                        "Men of small intelligence worship the demigods, and their fruits are limited and temporary. Those who worship the demigods go to the planets of the demigods, but My devotees ultimately reach My supreme planet.   ",
                        "Unintelligent men, who know Me not, think that I have assumed this form and personality. Due to their small knowledge, they do not know My higher nature, which is changeless and supreme.   ",
                        "I am never manifest to the foolish and unintelligent. For them I am covered by My eternal creative potency [yoga-maya]; and so the deluded world knows Me not, who am unborn and infallible.   ",
                        "O Arjuna, as the Supreme Personality of Godhead, I know everything that has happened in the past, all that is happening in the present, and all things that are yet to come. I also know all living entities; but Me no one knows.   ",
                        "O scion of Bharata [Arjuna], O conquerer of the foe, all living entities are born into delusion, overcome by the dualities of desire and hate.   ",
                        "Persons who have acted piously in previous lives and in this life, whose sinful actions are completely eradicated and who are freed from the duality of delusion, engage themselves in My service with determination.   ",
                        "Intelligent persons who are endeavoring for liberation from old age and death take refuge in Me in devotional service. They are actually Brahman because they entirely know everything about transcendental and fruitive activities.   ",
                        "Those who know Me as the Supreme Lord, as the governing principle of the material manifestation, who know Me as the one underlying all the demigods and as the one sustaining all sacrifices, can, with steadfast mind, understand and know Me even at the time of death."},




                {"Arjuna inquired: O my Lord, O Supreme Person, what is Brahman? What is the self? What are fruitive activities? What is this material manifestation? And what are the demigods? Please explain this to me.   ",
                        "How does this Lord of sacrifice live in the body, and in which part does He live, O Madhusudana? And how can those engaged in devotional service know You at the time of death?   ",
                        "The Supreme Lord said, The indestructible, transcendental living entity is called Brahman, and his eternal nature is called the self. Action pertaining to the development of these material bodies is called karma, or fruitive activities.   ",
                        "Physical nature is known to be endlessly mutable. The universe is the cosmic form of the Supreme Lord, and I am that Lord represented as the Supersoul, dwelling in the heart of every embodied being.   ",
                        "And whoever, at the time of death, quits his body, remembering Me alone, at once attains My nature. Of this there is no doubt.   ",
                        "Whatever state of being one remembers when he quits his body, that state he will attain without fail.   ",
                        "Therefore, Arjuna, you should always think of Me in the form of Krsna and at the same time carry out your prescribed duty of fighting. With your activities dedicated to Me and your mind and intelligence fixed on Me, you will attain Me without doubt.   ",
                        "He who meditates on the Supreme Personality of Godhead, his mind constantly engaged in remembering Me, undeviated from the path, he, O Partha [Arjuna], is sure to reach Me.   ",
                        "One should meditate upon the Supreme Person as the one who knows everything, as He who is the oldest, who is the controller, who is smaller than the smallest, who is the maintainer of everything, who is beyond all material conception, who is inconceivable, and who is always a person. He is luminous like the sun and, being transcendental, is beyond this material nature.   ",
                        "One who, at the time of death, fixes his life air between the eyebrows and in full devotion engages himself in remembering the Supreme Lord, will certainly attain to the Supreme Personality of Godhead.   ",
                        "Persons learned in the Vedas, who utter omkara and who are great sages in the renounced order, enter into Brahman. Desiring such perfection, one practices celibacy. I shall now explain to you this process by which one may attain salvation.   ",
                        "The yogic situation is that of detachment from all sensual engagements. Closing all the doors of the senses and fixing the mind on the heart and the life air at the top of the head, one establishes himself in yoga.   ",
                        "After being situated in this yoga practice and vibrating the sacred syllable om, the supreme combination of letters, if one thinks of the Supreme Personality of Godhead and quits his body, he will certainly reach the spiritual planets.   ",
                        "For one who remembers Me without deviation, I am easy to obtain, O son of Prtha, because of his constant engagement in devotional service.   ",
                        "After attaining Me, the great souls, who are yogis in devotion, never return to this temporary world, which is full of miseries, because they have attained the highest perfection.   ",
                        "From the highest planet in the material world down to the lowest, all are places of misery wherein repeated birth and death take place. But one who attains to My abode, O son of Kunti, never takes birth again.   ",
                        "By human calculation, a thousand ages taken together is the duration of Brahma's one day. And such also is the duration of his night.   ",
                        "When Brahma's day is manifest, this multitude of living entities comes into being, and at the arrival of Brahma's night they are all annihilated.   ",
                        "Again and again the day comes, and this host of beings is active; and again the night falls, O Partha, and they are helplessly dissolved.   ",
                        "Yet there is another nature, which is eternal and is transcendental to this manifested and unmanifested matter. It is supreme and is never annihilated. When all in this world is annihilated, that part remains as it is.   ",
                        "That supreme abode is called unmanifested and infallible, and it is the supreme destination. When one goes there, he never comes back. That is My supreme abode.   ",
                        "The Supreme Personality of Godhead, who is greater than all, is attainable by unalloyed devotion. Although He is present in His abode, He is all-pervading, and everything is situated within Him.   ",
                        "O best of the Bharatas, I shall now explain to you the different times at which, passing away from this world, one does or does not come back.   ",
                        "Those who know the Supreme Brahman pass away from the world during the influence of the fiery god, in the light, at an auspicious moment, during the fortnight of the moon and the six months when the sun travels in the north.   ",
                        "The mystic who passes away from this world during the smoke, the night, the moonlight fortnight, or in the six months when the sun passes to the south, or who reaches the moon planet, again comes back.   ",
                        "According to the Vedas, there are two ways of passing from this world—one in light and one in darkness. When one passes in light, he does not come back; but when one passes in darkness, he returns.   ",
                        "The devotees who know these two paths, O Arjuna, are never bewildered. Therefore be always fixed in devotion.   ",
                        "A person who accepts the path of devotional service is not bereft of the results derived from studying the Vedas, performing austere sacrifices, giving charity or pursuing philosophical and fruitive activities. At the end he reaches the supreme abode."},





                {"The Supreme Lord said: My dear Arjuna, because you are never envious of Me, I shall impart to you this most secret wisdom, knowing which you shall be relieved of the miseries of material existence.   ",
                        "This knowledge is the king of education, the most secret of all secrets. It is the purest knowledge, and because it gives direct perception of the self by realization, it is the perfection of religion. It is everlasting, and it is joyfully performed.   ",
                        "Those who are not faithful on the path of devotional service cannot attain Me, O conqueror of foes, but return to birth and death in this material world.   ",
                        "By Me, in My unmanifested form, this entire universe is pervaded. All beings are in Me, but I am not in them.   ",
                        "And yet everything that is created does not rest in Me. Behold My mystic opulence! Although I am the maintainer of all living entities, and although I am everywhere, still My Self is the very source of creation.   ",
                        "As the mighty wind, blowing everywhere, always rests in ethereal space know that in the same manner all beings rest in Me.   ",
                        "O son of Kunti, at the end of the millennium every material manifestation enters into My nature, and at the beginning of another millennium, by My potency I again create.   ",
                        "The whole cosmic order is under Me. By My will it is manifested again and again, and by My will it is annihilated at the end.   ",
                        "O Dhananjaya, all this work cannot bind Me. I am ever detached, seated as though neutral.   ",
                        "This material nature is working under My direction, O son of Kunti, and it is producing all moving and unmoving beings. By its rule this manifestation is created and annihilated again and again.   ",
                        "Fools deride Me when I descend in the human form. They do not know My transcendental nature and My supreme dominion over all that be.   ",
                        "Those who are thus bewildered are attracted by demonic and atheistic views. In that deluded condition, their hopes for liberation, their fruitive activities, and their culture of knowledge are all defeated.   ",
                        "O son of Prtha, those who are not deluded, the great souls, are under the protection of the divine nature. They are fully engaged in devotional service because they know Me as the Supreme Personality of Godhead, original and inexhaustible.   ",
                        "Always chanting My glories, endeavoring with great determination, bowing down before Me, these great souls perpetually worship Me with devotion.   ",
                        "Others, who are engaged in the cultivation of knowledge, worship the Supreme Lord as the one without a second, diverse in many, and in the universal form.   ",
                        "But it is I who am the ritual, I the sacrifice, the offering to the ancestors, the healing herb, the transcendental chant. I am the butter and the fire and the offering.   ",
                        "I am the father of this universe, the mother, the support, and the grandsire. I am the object of knowledge, the purifier and the syllable om. I am also the Rk, the Sama, and the Yajur [Vedas].   ",
                        "I am the goal, the sustainer, the master, the witness, the abode, the refuge and the most dear friend. I am the creation and the annihilation, the basis of everything, the resting place and the eternal seed.   ",
                        "O Arjuna, I control heat, the rain and the drought. I am immortality, and I am also death personified. Both being and nonbeing are in Me.   ",
                        "Those who study the Vedas and drink the soma juice, seeking the heavenly planets, worship Me indirectly. They take birth on the planet of Indra, where they enjoy godly delights.   ",
                        "When they have thus enjoyed heavenly sense pleasure, they return to this mortal planet again. Thus, through the Vedic principles, they achieve only flickering happiness.   ",
                        "But those who worship Me with devotion, meditating on My transcendental form-to them I carry what they lack and preserve what they have.   ",
                        "Whatever a man may sacrifice to other gods, O son of Kunti, is really meant for Me alone, but it is offered without true understanding.   ",
                        "I am the only enjoyer and the only object of sacrifice. Those who do not recognize My true transcendental nature fall down.   ",
                        "Those who worship the demigods will take birth among the demigods; those who worship ghosts and spirits will take birth among such beings; those who worship ancestors go to the ancestors; and those who worship Me will live with Me.   ",
                        "If one offers Me with love and devotion a leaf, a flower, fruit a water, I will accept it.   ",
                        "O son of Kunti, all that you do, all that you eat, all that you offer and give away, as well as all austerities that you may perform, should be done as an offering unto Me.   ",
                        "In this way you will be freed from all reactions to good and evil deeds, and by this principle of renunciation you will be liberated and come to Me.   ",
                        "I envy no one, nor am I partial to anyone. I am equal to all. But whoever renders service unto Me in devotion is a friend, is in Me, and I am also a friend to him.   ",
                        "Even if one commits the most abominable actions, if he is engaged in devotional service, he is to be considered saintly because he is properly situated.   ",
                        "He quickly becomes righteous and attains lasting peace. O son of Kunti, declare it boldly that My devotee never perishes.   ",
                        "O son of Prtha, those who take shelter in Me, though they be of lower birth-women, vaisyas [merchants], as well as sudras [workers]-can approach the supreme destination.   ",
                        "How much greater then are the brahmanas, the righteous, the devotees and saintly kings who in this temporary miserable world engage in loving service unto Me.   ",
                        "Engage your mind always in thinking of Me, offer obeisances and worship Me. Being completely absorbed in Me, surely you will come to Me."},




                {"The Supreme Lord said: My dear friend, mighty-armed Arjuna, listen again to My supreme word, which I shall impart to you for your benefit and which will give you great joy.   ",
                        "Neither the hosts of demigods nor the great sages know My origin, for, in every respect, I am the source of the demigods and the sages.   ",
                        "He who knows Me as the unborn, as the beginningless, as the Supreme Lord of all the worlds-he, undeluded among men, is freed from all sins.   ",
                        "Intelligence, knowledge, freedom from doubt and delusion, forgiveness, truthfulness, self-control and calmness, pleasure and pain, birth, death, fear, fearlessness, nonviolence, equanimity, satisfaction, austerity, charity, fame and infamy are created by Me alone.   ",
                        "The seven great sages and before them the four other great sages and the Manus [progenitors of mankind] are born out of My mind, and all creatures in these planets descend from them.   ",
                        "He who knows in truth this glory and power of Mine engages in unalloyed devotional service; of this there is no doubt.   ",
                        "I am the source of all spiritual and material worlds. Everything emanates from Me. The wise who know this perfectly engage in My devotional service and worship Me with all their hearts.   ",
                        "The thoughts of My pure devotees dwell in Me, their lives are surrendered to Me, and they derive great satisfaction and bliss enlightening one another and conversing about Me.   ",
                        "To those who are constantly devoted and worship Me with love, I give the understanding by which they can come to Me.   ",
                        "Out of compassion for them, I, dwelling in their hearts, destroy with the shining lamp of knowledge the darkness born of ignorance.   ",
                        "Arjuna said: You are the Supreme Brahman, the ultimate, the supreme abode and purifier, the Absolute Truth and the eternal divine person. You are the primal God, transcendental and original, and You are the unborn and all-pervading beauty. All the great sages such as Narada, Asita, Devala, and Vyasa proclaim this of You, and now You Yourself are declaring it to me.   ",
                        "O Krsna, I totally accept as truth all that You have told me. Neither the gods nor demons, O Lord, know Thy personality.   ",
                        "Indeed, You alone know Yourself by Your own potencies, O origin of all, Lord of all beings, God of gods, O Supreme Person, Lord of the universe!   ",
                        "Please tell me in detail of Your divine powers by which You pervade all these worlds and abide in them.   ",
                        "How should I meditate on You? In what various forms are You to be contemplated, O Blessed Lord?   ",
                        "Tell me again in detail, O Janardana [Krsna], of Your mighty potencies and glories, for I never tire of hearing Your ambrosial words.   ",
                        "The Blessed Lord said: Yes, I will tell you of My splendorous manifestations, but only of those which are prominent, O Arjuna, for My opulence is limitless.   ",
                        "I am the Self, O Gudakesa, seated in the hearts of all creatures. I am the beginning, the middle and the end of all beings.   ",
                        "Of the Adityas I am Visnu, of lights I am the radiant sun, I am Marici of the Maruts, and among the stars I am the moon.   ",
                        "Of the Vedas I am the Sama-veda; of the demigods I am Indra; of the senses I am the mind, and in living beings I am the living force [knowledge].   ",
                        "Of all the Rudras I am Lord Siva; of the Yaksas and Raksasas I am the lord of wealth [Kuvera]; of the Vasus I am fire [Agni], and of the mountains I am Meru.   ",
                        "Of priests, O Arjuna, know Me to be the chief, Brhaspati, the lord of devotion. Of generals I am Skanda, the lord of war; and of bodies of water I am the ocean.   ",
                        "Of the great sages I am Bhrgu; of vibrations I am the transcendental om. Of sacrifices I am the chanting of the holy names [japa], and of immovable things I am the Himalayas.   ",
                        "Of all trees I am the holy fig tree, and amongst sages and demigods I am Narada. Of the singers of the gods [Gandharvas] I am Citraratha, and among perfected beings I am the sage Kapila.   ",
                        "Of horses know Me to be Uccaihsrava, who rose out of the ocean, born of the elixir of immortality; of lordly elephants I am Airavata, and among men I am the monarch.   ",
                        "Of weapons I am the thunderbolt; among cows I am the surabhi, givers of abundant milk. Of procreators I am Kandarpa, the god of love, and of serpents I am Vasuki, the chief.   ",
                        "Of the celestial Naga snakes I am Ananta; of the aquatic deities I am Varuna. Of departed ancestors I am Aryama, and among the dispensers of law I am Yama, lord of death.   ",
                        "Among the Daitya demons I am the devoted Prahlada; among subduers I am time; among the beasts I am the lion, and among birds I am Garuda, the feathered carrier of Visnu.   ",
                        "Of purifiers I am the wind; of the wielders of weapons I am Rama; of fishes I am the shark, and of flowing rivers I am the Ganges.   ",
                        "Of all creations I am the beginning and the end and also the middle, O Arjuna. Of all sciences I am the spiritual science of the Self, and among logicians I am the conclusive truth.   ",
                        "Of letters I am the letter A, and among compounds I am the dual word. I am also inexhaustable time, and of creators I am Brahma, whose manifold faces turn everywhere.   ",
                        "I am all-devouring death, and I am the generator of all things yet to be. Among women I am fame, fortune, speech, memory, intelligence, faithfulness and patience.   ",
                        "Of hymns I am the Brhat-sama sung to the Lord Indra, and of poetry I am the Gayatri verse, sung daily by brahmanas. Of months I am November and December, and of seasons I am flower-bearing spring.   ",
                        "I am also the gambling of cheats, and of the splendid I am the splendor. I am victory, I am adventure, and I am the strength of the strong.   ",
                        "Of the descendants of Vrsni I am Vasudeva, and of the Pandavas I am Arjuna. Of the sages I am Vyasa, and among great thinkers I am Usana.   ",
                        "Among punishments I am the rod of chastisement, and of those who seek victory, I am morality. Of secret things I am silence, and of the wise I am wisdom.   ",
                        "Furthermore, O Arjuna, I am the generating seed of all existences. There is no being-moving or unmoving-that can exist without Me.   ",
                        "O mighty conqueror of enemies, there is no end to My divine manifestations. What I have spoken to you is but a mere indication of My infinite opulences.   ",
                        "Know that all beautiful, glorious, and mighty creations spring from but a spark of My splendor.   ",
                        "But what need is there, Arjuna, for all this detailed knowledge? With a single fragment of Myself I pervade and support this entire universe."},



                {"Arjuna said: I have heard Your instruction on confidential spiritual matters which You have so kindly delivered unto me, and my illusion is now dispelled.   ",
                        "O lotus-eyed one, I have heard from You in detail about the appearance and disappearance of every living entity, as realized through Your inexhaustible glories.   ",
                        "O greatest of all personalities, O supreme form, though I see here before me Your actual position, I yet wish to see how You have entered into this cosmic manifestation. I want to see that form of Yours.   ",
                        "If You think that I am able to behold Your cosmic form, O my Lord, O master of all mystic power, then kindly show me that universal self.   ",
                        "The Blessed Lord said: My dear Arjuna, O son of Prtha, behold now My opulences, hundreds of thousands of varied divine forms, multicolored like the sea.   ",
                        "O best of the Bharatas, see here the different manifestations of Adityas, Rudras, and all the demigods. Behold the many things which no one has ever seen or heard before.   ",
                        "Whatever you wish to see can be seen all at once in this body. This universal form can show you all that you now desire, as well as whatever you may desire in the future. Everything is here completely.   ",
                        "But you cannot see Me with your present eyes. Therefore I give to you divine eyes by which you can behold My mystic opulence.   ",
                        "Sanjaya said: O King, speaking thus, the Supreme, the Lord of all mystic power, the Personality of Godhead, displayed His universal form to Arjuna.   ",
                        "Arjuna saw in that universal form unlimited mouths and unlimited eyes. It was all wondrous. The form was decorated with divine, dazzling ornaments and arrayed in many garbs. He was garlanded gloriously, and there were many scents smeared over His body. All was magnificent, all-expanding, unlimited. This was seen by Arjuna.   ",
                        "If hundreds of thousands of suns rose up at once into the sky, they might resemble the effulgence of the Supreme Person in that universal form.   ",
                        "At that time Arjuna could see in the universal form of the Lord the unlimited expansions of the universe situated in one place although divided into many, many thousands.   ",
                        "Then, bewildered and astonished, his hair standing on end, Arjuna began to pray with folded hands, offering obeisances to the Supreme Lord.   ",
                        "Arjuna said: My dear Lord Krsna, I see assembled together in Your body all the demigods and various other living entities. I see Brahma sitting on the lotus flower as well as Lord Siva and many sages and divine serpents.   ",
                        "O Lord of the universe, I see in Your universal body many, many forms-bellies, mouths, eyes-expanded without limit. There is no end, there is no beginning, and there is no middle to all this.   ",
                        "Your form, adorned with various crowns, clubs and discs, is difficult to see because of its glaring effulgence, which is fiery and immeasurable like the sun.   ",
                        "You are the supreme primal objective; You are the best in all the universes; You are inexhaustible, and You are the oldest; You are the maintainer of religion, the eternal Personality of Godhead.   ",
                        "You are the origin without beginning, middle or end. You have numberless arms, and the sun and moon are among Your great unlimited eyes. By Your own radiance You are heating this entire universe.   ",
                        "Although You are one, You are spread throughout the sky and the planets and all space between. O great one, as I behold this terrible form, I see that all the planetary systems are perplexed.   ",
                        "All the demigods are surrendering and entering into You. They are very much afraid, and with folded hands they are singing the Vedic hymns.   ",
                        "The different manifestations of Lord Siva, the Adityas, the Vasus, the Sadhyas, the Visvadevas, the two Asvins, the Maruts, the forefathers and the Gandharvas, the Yaksas, Asuras, and all perfected demigods are beholding You in wonder.   ",
                        "O mighty-armed one, all the planets with their demigods are disturbed at seeing Your many faces, eyes, arms, bellies and legs and Your terrible teeth, and as they are disturbed, so am I.   ",
                        "O all-pervading Visnu, I can no longer maintain my equilibrium. Seeing Your radiant colors fill the skies and beholding Your eyes and mouths, I am afraid.   ",
                        "O Lord of lords, O refuge of the worlds, please be gracious to me. I cannot keep my balance seeing thus Your blazing deathlike faces and awful teeth. In all directions I am bewildered.   ",
                        "All the sons of Dhrtarastra along with their allied kings, and Bhisma, Drona and Karna, and all our soldiers are rushing into Your mouths, their heads smashed by Your fearful teeth. I see that some are being crushed between Your teeth as well.   ",
                        "As the rivers flow into the sea, so all these great warriors enter Your blazing mouths and perish.   ",
                        "I see all people rushing with full speed into Your mouths as moths dash into a blazing fire.   ",
                        "O Visnu, I see You devouring all people in Your flaming mouths and covering the universe with Your immeasurable rays. Scorching the worlds, You are manifest.   ",
                        "O Lord of lords, so fierce of form, please tell me who You are. I offer my obeisances unto You; please be gracious to me. I do not know what Your mission is, and I desire to hear of it.   ",
                        "The Blessed Lord said: Time I am, destroyer of the worlds, and I have come to engage all people. With the exception of you [the Pandavas], all the soldiers here on both sides will be slain.   ",
                        "Therefore get up and prepare to fight. After conquering your enemies you will enjoy a flourishing kingdom. They are already put to death by My arrangement, and you, O Savyasacin, can be but an instmment in the fight.   ",
                        "The Blessed Lord said: All the great warriors-Drona, Bhisma, Jayadratha, Karna-are already destroyed. Simply fight, and you will vanquish your enemies.   ",
                        "Sanjaya said to Dhrtarastra: O King, after hearing these words from the Supreme Personality of Godhead, Arjuna trembled, fearfully offered obeisances with folded hands and began, falteringly, to speak as follows:   ",
                        "O Hrsikesa, the world becomes joyful upon hearing Your name and thus everyone becomes attached to You. Although the perfected beings offer You their respectful homage, the demons are afraid, and they flee here and there. All this is rightly done.   ",
                        "O great one, who stands above even Brahma, You are the original master. Why should they not offer their homage up to You, O limitless one? O refuge of the universe, You are the invincible source, the cause of all causes, transcendental to this material manifestation.   ",
                        "You are the original Personality, the Godhead. You are the only sanctuary of this manifested cosmic world. You know everything, and You are all that is knowable. You are above the material modes. O limitless form! This whole cosmic manifestation is pervaded by You!   ",
                        "You are air, fire, water, and You are the moon! You are the supreme controller and the grandfather. Thus I offer my respectful obeisances unto You a thousand times, and again and yet again!   ",
                        "Obeisances from the front, from behind and from all sides! O unbounded power, You are the master of limitless, might! You are all-pervading, and thus You are everything!   ",
                        "I have in the past addressed You as O Krsna, O Yadava, O my friend, without knowing Your glories. Please forgive whatever I may have done in madness or in love. I have dishonored You many times while relaxing or while lying on the same bed or eating together, sometimes alone and sometimes in front of many friends. Please excuse me for all my offenses.   ",
                        "You are the father of this complete cosmic manifestation, the worshipable chief, the spiritual master. No one is equal to You, nor can anyone be one with You. Within the three worlds, You are immeasurable.   ",
                        "You are the Supreme Lord, to be worshiped by every living being. Thus I fall down to offer You my respects and ask Your mercy. Please tolerate the wrongs that I may have done to You and bear with me as a father with his son, or a friend with his friend, or a lover with his beloved.   ",
                        "After seeing this universal form, which I have never seen before, I am gladdened, but at the same time my mind is disturbed with fear. Therefore please bestow Your grace upon me and reveal again Your form as the Personality of Godhead, O Lord of lords, O abode of the universe.   ",
                        "O universal Lord, I wish to see You in Your four-armed form, with helmeted head and with club, wheel, conch and lotus flower in Your hands. I long to see You in that form.   ",
                        "The Blessed Lord said: My dear Arjuna, happily do I show you this universal form within the material world by My internal potency. No one before you has ever seen this unlimited and glaringly effulgent form.   ",
                        "O best of the Kuru warriors, no one before you has ever seen this universal form of Mine, for neither by studying the Vedas, nor by performing sacrifices, nor by charities or similar activities can this form be seen. Only you have seen this.   ",
                        "Your mind has been perturbed upon seeing this horrible feature of Mine. Now let it be finished. My devotee, be free from all disturbance. With a peaceful mind you can now see the form you desire.   ",
                        "Sanjaya said to Dhrtarastra: The Supreme Personality of Godhead, Krsna, while speaking thus to Arjuna, displayed His real four-armed form, and at last He showed him His two-armed form, thus encouraging the fearful Arjuna.   ",
                        "When Arjuna thus saw Krsna in His original form, he said: Seeing this humanlike form, so very beautiful, my mind is now pacified, and I am restored to my original nature.   ",
                        "The Blessed Lord said: My dear Arjuna, the form which you are now seeing is very difficult to behold. Even the demigods are ever seeking the opportunity to see this form which is so dear.   ",
                        "The form which you are seeing with your transcendental eyes cannot be understood simply by studying the Vedas, nor by undergoing serious penances, nor by charity, nor by worship. It is not by these means that one can see Me as I am.   ",
                        "My dear Arjuna, only by undivided devotional service can I be understood as I am, standing before you, and can thus be seen directly. Only in this way can you enter into the mysteries of My understanding.   ",
                        "My dear Arjuna, one who is engaged in My pure devotional service, free from the contaminations of previous activities and from mental speculation, who is friendly to every living entity, certainly comes to Me."},


                {"Arjuna inquired: Which is considered to be more perfect: those who are properly engaged in Your devotional service, or those who worship the impersonal Brahman, the unmanifested?   ",
                        "The Blessed Lord said: He whose mind is fixed on My personal form, always engaged in worshiping Me with great and transcendental faith, is considered by Me to be most perfect.   ",
                        "But those who fully worship the unmanifested, that which lies beyond the perception of the senses, the all-pervading, inconceivable, fixed, and immovable-the impersonal conception of the Absolute Truth-by controlling the various senses and being equally disposed to everyone, such persons, engaged in the welfare of all, at last achieve Me.   ",
                        "For those whose minds are attached to the unmanifested, impersonal feature of the Supreme, advancement is very troublesome. To make progrese in that discipline is always difficult for those who are embodied.   ",
                        "For one who worships Me, giving up all his activities unto Me and being devoted to Me without deviation, engaged in devotional service and always meditating upon Me, who has fixed his mind upon Me, O son of Prtha, for him I am the swift deliverer from the ocean of birth and death.   ",
                        "Just fix your mind upon Me, the Supreme Personality of Godhead, and engage all your intelligence in Me. Thus you will live in Me always, without a doubt.   ",
                        "My dear Arjuna, O winner of wealth, if you cannot fix your mind upon Me without deviation, then follow the regulated principles of bhakti-yoga In this way you will develop a desire to attain to Me.   ",
                        "If you cannot practice the regulations of bhakti-yoga, then just try to work for Me, because by working for Me you will come to the perfect stage.   ",
                        "If, however, you are unable to work in this consciousness, then try to act giving up all results of your work and try to be self-situated.   ",
                        "If you cannot take to this practice, then engage yourself in the cultivation of knowledge. Better than knowledge, however, is meditation, and better than meditation is renunciation of the fruits of action, for by such renunciation one can attain peace of mind.   ",
                        "One who is not envious but who is a kind friend to all living entities, who does not think himself a proprietor, who is free from false ego and equal both in happiness and distress, who is always satisfied and engaged in devotional service with determination and whose mind and intelligence are in agreement with Me-he is very dear to Me.   ",
                        "He for whom no one is put into difficulty and who is not dirturbed by anxiety, who is steady in happiness and distress, is very dear to Me.   ",
                        "A devotee who is not dependant on the ordinary course of activities, who is pure, expert, without cares, free from all pains, and who does not strive for some result, is very dear to Me.   ",
                        "One who neither grasps pleasure or grief, who neither laments nor desires, and who renounces both auspicious and inauspicious things, is very dear to Me.   ",
                        "One who is equal to friends and enemies, who is equiposed in honor and dishonor, heat and cold, happiness and distress, fame and infamy, who is always free from contamination, always silent and satisfied with anything, who doesn't care for any residence, who is fixed in knowledge and engaged in devotional service, is very dear to Me.   ",
                        "He who follows this imperishable path of devotional service and who completely engages himself with faith, making Me the supreme goal, is very, very dear to Me."},


                {"Arjuna said: O my dear Krsna, I wish to know about prakrti [nature], Purusa [the enjoyer], and the field and the knower of the field, and of knowledge and the end of knowledge. The Blessed Lord then said: This body, O son of Kunti, is called the field, and one who knows this body is called the knower of the field.   ",
                        "O scion of Bharata, you should understand that I am also the knower in all bodies, and to understand this body and its owner is called knowledge. That is My opinion.   ",
                        "Now please hear My brief description of this field of activity and how it is constituted, what its changes are, whence it is produced, who that knower of the field of activities is, and what his influences are.   ",
                        "That knowledge of the field of activities and of the knower of activities is described by various sages in various Vedic writings-especially in the Vedanta-sutra-and is presented with all reasoning as to cause and effect.   ",
                        "The five great elements, false ego, intelligence, the unmanifested, the ten senses, the mind, the five sense objects, desire, hatred, happiness, distress, the aggregate, the life symptoms, and convictions-all these are considered, in summary, to be the field of activities and its interactions.   ",
                        "Humility, pridelessness, nonviolence, tolerance, simplicity, approaching a bona fide spiritual master, cleanliness, steadiness and self-control; renunciation of the objects of sense gratification, absence of false ego, the perception of the evil of birth, death, old age and disease; nonattachment to children, wife, home and the rest, and evenmindedness amid pleasant and unpleasant events; constant and unalloyed devotion to Me, resorting to solitary places, detachment from the general mass of people; accepting the importance of self-realization, and philosophical search for the Absolute Truth-all these I thus declare to be knowledge, and what is contrary to these is ignorance.   ",
                        "I shall now explain the knowable, knowing which you will taste the eternal. This is beginningless, and it is subordinate to Me. It is called Brahman, the spirit, and it lies beyond the cause and effect of this material world.   ",
                        "Everywhere are His hands and legs, His eyes and faces, and He hears everything. In this way the Supersoul exists.   ",
                        "The Supersoul is the original source of all senses, yet He is without senses. He is unattached, although He is the maintainer of all living beings. He transcends the modes of nature, and at the same time He is the master of all modes of material nature.   ",
                        "The Supreme Truth exists both internally and externally, in the moving and nonmoving. He is beyond the power of the material senses to see or to know. Although far, far away, He is also near to all.   ",
                        "Although the Supersoul appears to be divided, He is never divided. He is situated as one. Although He is the maintainer of every living entity, it is to be understood that He devours and develops all.   ",
                        "He is the source of light in all luminous objects. He is beyond the darkness of matter and is unmanifested. He is knowledge, He is the object of knowledge, and He is the goal of knowledge. He is situated in everyone's heart.   ",
                        "Thus the field of activities [the body], knowledge, and the knowable have been summarily described by Me. Only My devotees can understand this thoroughly and thus attain to My nature.   ",
                        "Material nature and the living entities should be understood to be beginningless. Their transformations and the modes of matter are products of material nature.   ",
                        "Nature is said to be the cause of all material activities and effects, whereas the living entity is the cause of the various sufferings and enjoyments in this world.   ",
                        "The living entity in material nature thus follows the ways of life, enjoying the three modes of nature. This is due to his association with that material nature. Thus he meets with good and evil amongst various species.   ",
                        "Yet in this body there is another, a transcendental enjoyer who is the Lord, the supreme proprietor, who exists as the overseer and permitter, and who is known as the Supersoul.   ",
                        "One who understands this philosophy concerning material nature, the living entity and the interaction of the modes of nature is sure to attain liberation. He will not take birth here again, regardless of his present position.   ",
                        "That Supersoul is perceived by some through meditation, by some through the cultivation of knowledge, and by others through working without fruitive desire.   ",
                        "Again there are those who, although not conversant in spiritual knowledge, begin to worship the Supreme Person upon hearing about Him from others. Because of their tendency to hear from authorities, they also transcend the path of birth and death.   ",
                        "O chief of the Bharatas, whatever you see in existence, both moving and unmoving, is only the combination of the field of activities and the knower of the field.   ",
                        "One who sees the Supersoul accompanying the individual soul in all bodies and who understands that neither the soul nor the Supersoul is ever destroyed, actually sees.   ",
                        "One who sees the Supersoul in every living being and equal everywhere does not degrade himself by his mind. Thus he approaches the transcendental destination.   ",
                        "One who can see that all activities are performed by the body, which is created of material nature, and sees that the self does nothing, actually sees.   ",
                        "When a sensible man ceases to see different identities, which are due to different material bodies, he attains to the Brahman conception. Thus he sees that beings are expanded everywhere.   ",
                        "Those with the vision of eternity can see that the soul is transcendental, eternal, and beyond the modes of nature. Despite contact with the material body, O Arjuna, the soul neither does anything nor is entangled.   ",
                        "The sky, due to its subtle nature, does not mix with anything, although it is all-pervading. Similarly, the soul, situated in Brahman vision, does not mix with the body, though situated in that body.   ",
                        "O son of Bharata, as the sun alone illuminates all this universe, so does the living entity, one within the body, illuminate the entire body by consciousness.   ",
                        "One who knowingly sees this difference between the body and the owner of the body and can understand the process of liberation from this bondage, also attains to the supreme goal."},



                {"The Blessed Lord said: Again I shall declare to you this supreme wisdom, the best of all knowledge, knowing which all the sages have attained to supreme perfection.   ",
                        "By becoming fixed in this knowledge, one can attain to the transcendental nature, which is like My own nature. Thus established, one is not born at the time of creation nor disturbed at the time of dissolution.   ",
                        "The total material substance, called Brahman, is the source of birth, and it is that Brahman that I impregnate, making possible the births of all living beings, O son of Bharata.   ",
                        "It should be understood that all species of life, O son of Kunti, are made possible by birth in this material nature, and that I am the seed-giving father.   ",
                        "Material nature consists of the three modes-goodness, passion and ignorance. When the living entity comes in contact with nature, he becomes conditioned by these modes.   ",
                        "O sinless one, the mode of goodness, being purer than the others, is illuminating, and it frees one from all sinful reactions. Those situated in that mode develop knowledge, but they become conditioned by the concept of happiness.   ",
                        "The mode of passion is born of unlimited desires and longings, O son of Kunti, and because of this one is bound to material fruitive activities.   ",
                        "O son of Bharata, the mode of ignorance causes the delusion of all living entities. The result of this mode is madness, indolence and sleep, which bind the conditioned soul.   ",
                        "The mode of goodness conditions one to happiness, passion conditions him to the fruits of action, and ignorance to madness.   ",
                        "Sometimes the mode of passion becomes prominent, defeating the mode of goodness, O son of Bharata. And sometimes the mode of goodness defeats passion, and at other times the mode of ignorance defeats goodness and passion. In this way there is always competition for supremacy.   ",
                        "The manifestations of the mode of goodness can be experienced when all the gates of the body are illuminated by knowledge.   ",
                        "O chief of the Bharatas, when there is an increase in the mode of passion, the symptoms of great attachment, uncontrollable desire, hankering, and intense endeavor develop.   ",
                        "O son of Kuru, when there is an increase in the mode of ignorance madness, illusion, inertia and darkness are manifested.   ",
                        "When one dies in the mode of goodness, he attains to the pure higher planets.   ",
                        "When one dies in the mode of passion, he takes birth among those engaged in fruitive activities; and when he dies in the mode of ignorance, he takes birth in the animal kingdom.   ",
                        "By acting in the mode of goodness, one becomes purified. Works done in the mode of passion result in distress, and actions performed in the mode of ignorance result in foolishness.   ",
                        "From the mode of goodness, real knowledge develops; from the mode of passion, grief develops; and from the mode of ignorance, foolishness, madness and illusion develop.   ",
                        "Those situated in the mode of goodness gradually go upward to the higher planets; those in the mode of passion live on the earthly planets; and those in the mode of ignorance go down to the hellish worlds.   ",
                        "When you see that there is nothing beyond these modes of nature in all activities and that the Supreme Lord is transcendental to all these modes, then you can know My spiritual nature.   ",
                        "When the embodied being is able to transcend these three modes, he can become free from birth, death, old age and their distresses and can enjoy nectar even in this life.   ",
                        "Arjuna inquired: O my dear Lord, by what symptoms is one known who is transcendental to those modes? What is his behavior? And how does he transcend the modes of nature?   ",
                        "The Blessed Lord said: He who does not hate illumination, attachment and delusion when they are present, nor longs for them when they disappear; who is seated like one unconcerned, being situated beyond these material reactions of the modes of nature, who remains firm, knowing that the modes alone are active; who regards alike pleasure and pain, and looks on a clod, a stone and a piece of gold with an equal eye; who is wise and holds praise and blame to be the same; who is unchanged in honor and dishonor, who treats friend and foe alike, who has abandoned all fruitive undertakings-such a man is said to have transcended the modes of nature.   ",
                        "One who engages in full devotional service, who does not fall down in any circumstance, at once transcends the modes of material nature and thus comes to the level of Brahman.   ",
                        "And I am the basis of the impersonal Brahman, which is the constitutional position of ultimate happiness, and which is immortal, imperishable and eternal."},


                {"The Blessed Lord said: There is a banyan tree which has its roots upward and its branches down and whose leaves are the Vedic hymns. One who knows this tree is the knower of the Vedas.   ",
                        "The branches of this tree extend downward and upward, nourished by the three modes of material nature. The twigs are the objects of the senses. This tree also has roots going down, and these are bound to the fruitive actions of human society.   ",
                        "The real form of this tree cannot be perceived in this world. No one can understand where it ends, where it begins, or where its foundation is. But with determination one must cut down this tree with the weapon of detachment. So doing, one must seek that place from which, having once gone, one never returns, and there surrender to that Supreme Personality of Godhead from whom everything has begun and in whom everything is abiding since time immemorial.   ",
                        "One who is free from illusion, false prestige, and false association, who understands the eternal, who is done with material lust and is freed from the duality of happiness and distress, and who knows how to surrender unto the Supreme Person, attains to that eternal kingdom.   ",
                        "That abode of Mine is not illumined by the sun or moon, nor by electricity. One who reaches it never returns to this material world.   ",
                        "The living entities in this conditioned world are My eternal, fragmental parts. Due to conditioned life, they are struggling very hard with the six senses, which include the mind.   ",
                        "The living entity in the material world carries his different conceptions of life from one body to another as the air carries aromas.   ",
                        "The living entity, thus taking another gross body, obtains a certain type of ear, tongue, and nose and sense of touch, which are grouped about the mind. He thus enjoys a particular set of sense objects.   ",
                        "The foolish cannot understand how a living entity can quit his body, nor can they understand what sort of body he enjoys under the spell of the modes of nature. But one whose eyes are trained in knowledge can see all this.   ",
                        "The endeavoring transcendentalist, who is situated in self-realization, can see all this clearly. But those who are not situated in self-realization cannot see what is taking place, though they may try to.   ",
                        "The splendor of the sun, which dissipates the darkness of this whole world, comes from Me. And the splendor of the moon and the splendor of fire are also from Me.   ",
                        "I enter into each planet, and by My energy they stay in orbit. I become the moon and thereby supply the juice of life to all vegetables.   ",
                        "I am the fire of digestion in every living body, and I am the air of life, outgoing and incoming, by which I digest the four kinds of foodstuff.   ",
                        "I am seated in everyone's heart, and from Me come remembrance, knowledge and forgetfulness. By all the Vedas am I to be known; indeed I am the compiler of Vedanta, and I am the knower of the Vedas.   ",
                        "There are two classes of beings, the fallible and the infallible. In the material world every entity is fallible, and in the spiritual world every entity is called infallible.   ",
                        "Besides these two, there is the greatest living personality, the Lord Himself, who has entered into these worlds and is maintaining them.   ",
                        "Because I am transcendental, beyond both the fallible and the infallible, and because I am the greatest, I am celebrated both in the world and in the Vedas as that Supreme Person.   ",
                        "Whoever knows Me as the Supreme Personality of Godhead, without doubting, is to be understood as the knower of everything, and he therefore engages himself in full devotional service, O son of Bharata   ",
                        "This is the most confidential part of the Vedic scriptures, O sinless one, and it is disclosed now by Me. Whoever understands this will become wise, and his endeavors will know perfection."},




                {"The Blessed Lord said: Fearlessness, purification of one's existence, cultivation of spiritual knowledge, charity, self-control, performance of sacrifice, study of the Vedas, austerity and simplicity; nonviolence, truthfulness, freedom from anger; renunciation, tranquility, aversion to faultfinding, compassion and freedom from covetousness; gentleness, modesty and steady determination; vigor, forgiveness, fortitude, cleanliness, freedom from envy and the passion for honor-these transcendental qualities, O son of Bharata, belong to godly men endowed with divine nature.   ",
                        "Arrogance, pride, anger, conceit, harshness and ignorance-these qualities belong to those of demonic nature, O son of Prtha.   ",
                        "The transcendental qualities are conducive to liberation, whereas the demonic qualities make for bondage. Do not worry, O son of Pandu, for you are born with the divine qualities.   ",
                        "O son of Prtha, in this world there are two kinds of created beings. One is called the divine and the other demonic. I have already explained to you at length the divine qualities. Now hear from Me of the demoniac.   ",
                        "Those who are demoniac do not know what is to be done and what is not to be done. Neither cleanliness nor proper behavior nor truth is found in them.   ",
                        "They say that this world is unreal, that there is no foundation and that there is no God in control. It is produced of sex desire, and has no cause other than lust.   ",
                        "Following such conclusions, the demoniac, who are lost to themselves and who have no intelligence, engage in unbeneficial, horrible works meant to destroy the world.   ",
                        "The demoniac, taking shelter of insatiable lust, pride and false prestige, and being thus illusioned, are always sworn to unclean work, attracted by the impermanent.   ",
                        "They believe that to gratify the senses unto the end of life is the prime necessity of human civilization. Thus there is no end to their anxiety. Being bound by hundreds and thousands of desires, by lust and anger, they secure money by illegal means for sense gratification.   ",
                        "The demoniac person thinks: So much wealth do I have today, and I will gain more according to my schemes. So much is mine now, and it will increase in the future, more and more. He is my enemy, and I have killed him; and my other enemy will also be killed. I am the lord of everything, I am the enjoyer, I am perfect, powerful and happy. I am the richest man, surrounded by aristocratic relatives. There is none so powerful and happy as I am. I shall perform sacrifices, I shall give some charity, and thus I shall rejoice. In this way, such persons are deluded by ignorance.   ",
                        "Thus perplexed by various anxieties and bound by a network of illusions, one becomes too strongly attached to sense enjoyment and falls down into hell.   ",
                        "Self-complacent and always impudent, deluded by wealth and false prestige, they sometimes perform sacrifices in name only without following any rules or regulations.   ",
                        "Bewildered by false ego, strength, pride, lust and anger, the demon becomes envious of the Supreme Personality of Godhead, who is situated in his own body and in the bodies of others, and blasphemes against the real religion.   ",
                        "Those who are envious and mischievous, who are the lowest among men, are cast by Me into the ocean of material existence, into various demoniac species of life.   ",
                        "Attaining repeated birth amongst the species of demoniac life, such persons can never approach Me. Gradually they sink down to the most abominable type of existence.   ",
                        "There are three gates leading to this hell-lust, anger, and greed. Every sane man should give these up, for they lead to the degradation of the soul.   ",
                        "The man who has escaped these three gates of hell, O son of Kunti, performs acts conducive to self-realization and thus gradually attains the supreme destination.   ",
                        "But he who discards scriptural injunctions and acts according to his own whims attains neither perfection, nor happiness, nor the supreme destination.   ",
                        "One should understand what is duty and what is not duty by the regulations of the scriptures. Knowing such rules and regulations, one should act so that he may gradually be elevated."},




                {"Arjuna said, O Krsna, what is the situation of one who does not follow the principles of scripture but worships according to his own imagination? Is he in goodness, in passion or in ignorance?   ",
                        "The Supreme Lord said, according to the modes of nature acquired by the embodied soul, one's faith can be of three kinds-goodness, passion or ignorance. Now hear about these.   ",
                        "According to one's existence under the various modes of nature, one evolves a particular kind of faith. The living being is said to be of a particular faith according to the modes he has acquired.   ",
                        "Men in the mode of goodness worship the demigods; those in the mode of passion worship the demons; and those in the mode of ignorance worship ghosts and spirits.   ",
                        "Those who undergo severe austerities and penances not recommended in the scriptures, performing them out of pride, egotism, lust and attachment, who are impelled by passion and who torture their bodily organs as well as the Supersoul dwelling within are to be known as demons.   ",
                        "Even food of which all partake is of three kinds, according to the three modes of material nature. The same is true of sacrifices, austerities and charity. Listen, and I shall tell you of the distinctions of these.   ",
                        "Foods in the mode of goodness increase the duration of life, purify one's existence and give strength, health, happiness and satisfaction. Such nourishing foods are sweet, juicy, fattening and palatable. Foods that are too bitter, too sour, salty, pungent, dry and hot, are liked by people in the modes of passion. Such foods cause pain, distress, and disease. Food cooked more than three hours before being eaten, which is tasteless, stale, putrid, decomposed and unclean, is food liked by people in the mode of ignorance.   ",
                        "Of sacrifices, that sacrifice performed according to duty and to scriptural rules, and with no expectation of reward, is of the nature of goodness.   ",
                        "But that sacrifice performed for some material end or benefit or performed ostentatiously, out of pride, is of the nature of passion, O chief of the Bharatas.   ",
                        "And that sacrifice performed in defiance of scriptural injunctions, in which no spiritual food is distributed, no hymns are chanted and no remunerations are made to the priests, and which is faithless-that sacrifice is of the nature of ignorance.   ",
                        "The austerity of the body consists in this: worship of the Supreme Lord, the brahmanas, the spiritual master, and superiors like the father and mother. Cleanliness, simplicity, celibacy and nonviolence are also austerities of the body.   ",
                        "Austerity of speech consists in speaking truthfully and beneficially and in avoiding speech that offends. One should also recite the Vedas regularly.   ",
                        "And serenity, simplicity, gravity, self-control and purity of thought are the austerities of the mind.   ",
                        "This threefold austerity, practiced by men whose aim is not to benefit themselves materially but to please the Supreme, is of the nature of goodness.   ",
                        "Those ostentatious penances and austerities which are performed in order to gain respect, honor and reverence are said to be in the mode of passion. They are neither stable nor permanent.   ",
                        "And those penances and austerities which are performed foolishly by means of obstinant self-torture, or to destroy or injure others, are said to be in the mode of ignorance.   ",
                        "That gift which is given out of duty, at the proper time and place, to a worthy person, and without expectation of return, is considered to be charity in the mode of goodness.   ",
                        "But charity performed with the expectation of some return, or with a desire for fruitive results, or in a grudging mood, is said to be charity in the mode of passion.   ",
                        "And charity performed at an improper place and time and given to unworthy persons without respect and with contempt is charity in the mode of ignorance.   ",
                        "From the beginning of creation, the three syllables-om tat sat-have been used to indicate the Supreme Absolute Truth [Brahman]. They were uttered by brahmanas while chanting Vedic hymns and during sacrifices, for the satisfaction of the Supreme.   ",
                        "Thus the transcendentalists undertake sacrifices, charities, and penances, beginning always with om, to attain the Supreme.   ",
                        "One should perform sacrifice, penance and charity with the word tat. The purpose of such transcendental activities is to get free from the material entanglement.   ",
                        "The Absolute Truth is the objective of devotional sacrifice, and it is indicated by the word sat. These works of sacrifice, of penance and of charity, true to the absolute nature, are performed to please the Supreme Person, O son of Prtha.   ",
                        "But sacrifices, austerities and charities performed without faith in the Supreme are nonpermanent, O son of Prtha, regardless of whatever rites are performed. They are called asat and are useless both in this life and the next."},




                {"Arjuna said, O mighty-armed one, I wish to understand the purpose of renunciation [tyaga] and of the renounced order of life [sannyasa], O killer of the Kesi demon, Hrsikesa.   ",
                        "The Supreme Lord said, To give up the results of all activities is called renunciation [tyaga] by the wise. And that state is called the renounced order of life [sannyasa] by great learned men.   ",
                        "Some learned men declare that all kinds of fruitive activities should be given up, but there are yet other sages who maintain that acts of sacrifice, charity and penance should never be abandoned.   ",
                        "O best of the Bharatas, hear from Me now about renunciation. O tiger among men, there are three kinds of renunciation declared in the scriptures.   ",
                        "Acts of sacrifice, charity and penance are not to be given up but should be performed. Indeed, sacrifice, charity and penance purify even the great souls.   ",
                        "All these activities should be performed without any expectation of result. They should be performed as a matter of duty, O son of Prtha. That is My final opinion.   ",
                        "Prescribed duties should never be renounced. If, by illusion, one gives up his prescribed duties, such renunciation is said to be in the mode of ignorance.   ",
                        "Anyone who gives up prescribed duties as troublesome, or out of fear, is said to be in the mode of passion. Such action never leads to the elevation of renunciation.   ",
                        "But he who performs his prescribed duty only because it ought to be done, and renounces all attachment to the fruit-his renunciation is of the nature of goodness, O Arjuna.   ",
                        "Those who are situated in the mode of goodness, who neither hate inauspicious work nor are attached to auspicious work, have no doubts about work.   ",
                        "It is indeed impossible for an embodied being to give up all activities. Therefore it is said that he who renounces the fruits of action is one who has truly renounced.   ",
                        "For one who is not renounced, the threefold fruits of action-desirable, undesirable and mixed-accrue after death. But those who are in the renounced order of life have no such results to suffer or enjoy.   ",
                        "O mighty-armed Arjuna, learn from Me of the five factors which bring about the accomplishment of all action. These are declared in sankhya philosophy to be the place of action, the performer, the senses, the endeavor, and ultimately the Supersoul.   ",
                        "Whatever right or wrong action a man performs by body, mind or speech is caused by these five factors.   ",
                        "Therefore one who thinks himself the only doer, not considering the five factors, is certainly not very intelligent and cannot see things as they are.   ",
                        "One who is not motivated by false ego, whose intelligence is not entangled, though he kills men in this world, is not the slayer. Nor is he bound by his actions.   ",
                        "Knowledge, the object of knowledge and the knower are the three factors which motivate action; the senses, the work and the doer comprise the threefold basis of action.   ",
                        "In accordance with the three modes of material nature, there are three kinds of knowledge, action, and performers of action. Listen as I describe them.   ",
                        "That knowledge by which one undivided spiritual nature is seen in all existences, undivided in the divided, is knowledge in the mode of goodness.   ",
                        "That knowledge by which a different type of living entity is seen to be dwelling in different bodies is knowledge in the mode of passion.   ",
                        "And that knowledge by which one is attached to one kind of work as the all in all, without knowledge of the truth, and which is very meager, is said to be in the mode of darkness.   ",
                        "As for actions, that action in accordance with duty, which is performed without attachment, without love or hate, by one who has renounced fruitive results, is called action in the mode of goodness.   ",
                        "But action performed with great effort by one seeking to gratify his desires, and which is enacted from a sense of false ego, is called action in the mode of passion.   ",
                        "And that action performed in ignorance and delusion without consideration of future bondage or consequences, which inflicts injury and is impractical, is said to be action in the mode of ignorance.   ",
                        "The worker who is free from all material attachments and false ego, who is enthusiastic and resolute and who is indifferent to success or failure, is a worker in the mode of goodness.   ",
                        "But that worker who is attached to the fruits of his labor and who passionately wants to enjoy them, who is greedy, envious and impure and moved by happiness and distress, is a worker in the mode of passion.   ",
                        "And that worker who is always engaged in work against the injunction of the scripture, who is materialistic, obstinate, cheating and expert in insulting others, who is lazy, always morose and procrastinating, is a worker in the mode of ignorance.   ",
                        "Now, O winner of wealth, please listen as I tell you in detail of the three kinds of understanding and determination according to the three modes of nature.   ",
                        "O son of Prtha, that understanding by which one knows what ought to be done and what ought not to be done, what is to be feared and what is not to be feared, what is binding and what is liberating, that understanding is established in the mode of goodness.   ",
                        "And that understanding which cannot distinguish between the religious way of life and the irreligious, between action that should be done and action that should not be done, that imperfect understanding, O son of Prtha, is in the mode of passion.   ",
                        "That understanding which considers irreligion to be religion and religion to be irreligion, under the spell of illusion and darkness, and strives always in the wrong direction, O Partha, is in the mode of ignorance.   ",
                        "O son of Prtha, that determination which is unbreakable, which is sustained with steadfastness by yoga practice, and thus controls the mind, life, and the acts of the senses, is in the mode of goodness.   ",
                        "And that determination by which one holds fast to fruitive result in religion, economic development and sense gratification is of the nature of passion, O Arjuna.   ",
                        "And that determination which cannot go beyond dreaming, fearfulness, lamentation, moroseness, and illusion-such unintelligent determination is in the mode of darkness.   ",
                        "O best of the Bharatas, now please hear from Me about the three kinds of happiness which the conditioned soul enjoys, and by which he sometimes comes to the end of all distress. That which in the beginning may be just like poison but at the end is just like nectar and which awakens one to self-realization is said to be happiness in the mode of goodness.   ",
                        "That happiness which is derived from contact of the senses with their objects and which appears like nectar at first but poison at the end is said to be of the nature of passion.   ",
                        "And that happiness which is blind to self-realization, which is delusion from beginning to end and which arises from sleep, laziness and illusion is said to be of the nature of ignorance.   ",
                        "There is no being existing, either here or among the demigods in the higher planetary systems, which is freed from the three modes of material nature.   ",
                        "Brahmanas, ksatriyas, vaisyas and sudras are distinguished by their qualities of work, O chastiser of the enemy, in accordance with the modes of nature.   ",
                        "Peacefulness, self-control, austerity, purity, tolerance, honesty, wisdom, knowledge, and religiousness-these are the qualities by which the brahmanas work.   ",
                        "Heroism, power, determination, resourcefulness, courage in battle, generosity, and leadership are the qualities of work for the ksatriyas.   ",
                        "Farming, cattle raising and business are the qualities of work for the vaisyas, and for the sudras there is labor and service to others.   ",
                        "By following his qualities of work, every man can become perfect. Now please hear from Me how this can be done.   ",
                        "By worship of the Lord, who is the source of all beings and who is all-pervading, man can, in the performance of his own duty, attain perfection.   ",
                        "It is better to engage in one's own occupation, even though one may perform it imperfectly, than to accept another's occupation and perform it perfectly. Prescribed duties, according to one's nature, are never affected by sinful reactions.   ",
                        "Every endeavor is covered by some sort of fault, just as fire is covered by smoke. Therefore one should not give up the work which is born of his nature, O son of Kunti, even if such work is full of fault.   ",
                        "One can obtain the results of renunciation simply by self-control and by becoming unattached to material things and disregarding material enjoyments. That is the highest perfectional stage of renunciation.   ",
                        "O son of Kunti, learn from Me in brief how one can attain to the supreme perfectional stage, Brahman, by acting in the way which I shall now summarize.   ",
                        "Being purified by his intelligence and controlling the mind with determination, giving up the objects of sense gratification, being freed from attachment and hatred, one who lives in a secluded place, who eats little and who controls the body and the tongue, and is always in trance and is detached, who is without false ego, false strength, false pride, lust, anger, and who does not accept material things, such a person is certainly elevated to the position of self-realization.   ",
                        "One who is thus transcendentally situated at once realizes the Supreme Brahman. He never laments nor desires to have anything; he is equally disposed to every living entity. In that state he attains pure devotional service unto Me.   ",
                        "One can understand the Supreme Personality as He is only by devotional service. And when one is in full consciousness of the Supreme Lord by such devotion, he can enter into the kingdom of God.   ",
                        "Though engaged in all kinds of activities, My devotee, under My protection, reaches the eternal and imperishable abode by My grace.   ",
                        "In all activities just depend upon Me and work always under My protection. In such devotional service, be fully conscious of Me.   ",
                        "If you become conscious of Me, you will pass over all the obstacles of conditional life by My grace. If, however, you do not work in such consciousness but act through false ego, not hearing Me, you will be lost.   ",
                        "If you do not act according to My direction and do not fight, then you will be falsely directed. By your nature, you will have to be engaged in warfare.   ",
                        "Under illusion you are now declining to act according to My direction. But, compelled by your own nature, you will act all the same, O son of Kunti.   ",
                        "The Supreme Lord is situated in everyone's heart, O Arjuna, and is directing the wanderings of all living entities, who are seated as on a machine, made of the material energy.   ",
                        "O scion of Bharata, surrender unto Him utterly. By His grace you will attain transcendental peace and the supreme and eternal abode.   ",
                        "Thus I have explained to you the most confidential of all knowledge. Deliberate on this fully, and then do what you wish to do.   ",
                        "Because you are My very dear friend, I am speaking to you the most confidential part of knowledge. Hear this from Me, for it is for your benefit.   ",
                        "Always think of Me and become My devotee. Worship Me and offer your homage unto Me. Thus you will come to Me without fail. I promise you this because you are My very dear friend.   ",
                        "Abandon all varieties of religion and just surrender unto Me. I shall deliver you from all sinful reaction. Do not fear.   ",
                        "This confidential knowledge may not be explained to those who are not austere, or devoted, or engaged in devotional service, nor to one who is envious of Me.   ",
                        "For one who explains the supreme secret to the devotees, devotional service is guaranteed, and at the end he will come back to Me.   ",
                        "There is no servant in this world more dear to Me than he, nor will there ever be one more dear.   ",
                        "And I declare that he who studies this sacred conversation worships Me by his intelligence.   ",
                        "And one who listens with faith and without envy becomes free from sinful reaction and attains to the planets where the pious dwell.   ",
                        "O conqueror of wealth, Arjuna, have you heard this attentively with your mind? And are your illusions and ignorance now dispelled?   ",
                        "Arjuna said, My dear Krsna, O infallible one, my illusion is now gone. I have regained my memory by Your mercy, and I am now firm and free from doubt and am prepared to act according to Your instructions.   ",
                        "Sanjaya said: Thus have I heard the conversation of two great souls, Krsna and Arjuna. And so wonderful is that message that my hair is standing on end.   ",
                        "By the mercy of Vyasa, I have heard these most confidential talks directly from the master of all mysticism, Krsna, who was speaking personally to Arjuna.   ",
                        "O King, as I repeatedly recall this wondrous and holy dialogue between Krsna and Arjuna, I take pleasure, being thrilled at every moment.   ",
                        "O King, when I remember the wonderful form of Lord Krsna, I am struck with even greater wonder, and I rejoice again and again.   ",
                        "Wherever there is Krsna, the master of all mystics, and wherever there is Arjuna, the supreme archer, there will also certainly be opulence, victory, extraordinary power, and morality. That is my opinion."}};




        gitaText.setData(shlokas);


        selected_sholkas = (Button)findViewById(R.id.button);
        completeGita = (Button) findViewById(R.id.button2);
        randomShloka = (Button)findViewById(R.id.button4);
        shlokaOfTheDay = (Button)findViewById(R.id.button3);
        aboutTheGita = (Button)findViewById(R.id.button5);
        shareApp = (Button)findViewById(R.id.button6);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 00);
        calendar.set(Calendar.MINUTE, 02);
        calendar.set(Calendar.SECOND, 0);

        Intent notifyIntent = new Intent(getApplicationContext(),showNotification.class);

        boolean isWorking = (PendingIntent.getBroadcast(MainActivity.this, 0, notifyIntent, PendingIntent.FLAG_NO_CREATE) != null);
        if (isWorking) {
            Log.d("alarm", "is working");} else {Log.d("alarm", "is not working");
        }
        if(!isWorking) {
            notifyIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
            PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(), 0, notifyIntent, PendingIntent.FLAG_UPDATE_CURRENT);
            AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 1000 * 60 * 60 * 24, pendingIntent);
        }

        completeGita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ChapterList.class);
                startActivity(intent);


            }


        });

        selected_sholkas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),grid.class);
                startActivity(intent);
            }
        });

        randomShloka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RandomShloka.class);
                startActivity(intent);
            }
        });

        shlokaOfTheDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ShlokaOfTheDay.class);
                startActivity(intent);
            }
        });
        shareApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                    String shareMessage= "\nI'm using the Bhagawad Gita app. It has the entire Bhagawad Gita, and verses organized by topics. You can get it here: \n\n";
                    shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                } catch(Exception e) {
                    //e.toString();
                }


            }


        });

        aboutTheGita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AboutTheGita.class);
                startActivity(intent);

            }
        });
    }
}